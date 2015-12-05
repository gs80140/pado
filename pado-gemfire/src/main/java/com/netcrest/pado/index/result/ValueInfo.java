/*
 * Copyright (c) 2013-2015 Netcrest Technologies, LLC. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netcrest.pado.index.result;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

import com.gemstone.gemfire.DataSerializable;
import com.gemstone.gemfire.DataSerializer;
import com.gemstone.gemfire.cache.query.internal.StructImpl;

public class ValueInfo implements DataSerializable, Comparable<ValueInfo>
{
	private static final long serialVersionUID = 1L;

	private static final byte TYPE_SERIALIZABLE = 0;
	private static final byte TYPE_STRUCT = 1;
	private static final byte TYPE_NOT_SUPPORTED = -1;

	private Object value;
	private int index;

	public ValueInfo()
	{
	}

	/**
	 * @param value
	 * @param index
	 */
	public ValueInfo(Object value, int index)
	{
		super();
		this.value = value;
		this.index = index;
	}

	public Object getValue()
	{
		return value;
	}

	public void setValue(Object value)
	{
		this.value = value;
	}

	public int getIndex()
	{
		return index;
	}

	public void setIndex(int index)
	{
		this.index = index;
	}

	/**
	 * Reads the state of this object from the given <code>DataInput</code>.
	 * 
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public void fromData(DataInput input) throws IOException, ClassNotFoundException
	{
		byte type = input.readByte();
		switch (type) {
		case TYPE_SERIALIZABLE:
			value = DataSerializer.readObject(input);
			break;
		case TYPE_STRUCT:
			StructImpl struct = new StructImpl();
			struct.fromData(input);
			value = struct;
			break;
		default:
			value = DataSerializer.readObject(input);
			break;
		}
		index = DataSerializer.readPrimitiveInt(input);
	}

	/**
	 * Writes the state of this object to the given <code>DataOutput</code>.
	 * 
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public void toData(DataOutput output) throws IOException
	{
		if (value instanceof Serializable) {
			output.writeByte(TYPE_SERIALIZABLE);
			DataSerializer.writeObject(value, output);
		} else if (value instanceof StructImpl) {
			output.writeByte(TYPE_STRUCT);
			((StructImpl) value).toData(output);
		} else {
			output.writeByte(TYPE_NOT_SUPPORTED);
			DataSerializer.writeObject(value, output);
		}
		DataSerializer.writePrimitiveInt(index, output);
	}

	@Override
	public int compareTo(ValueInfo anotherValueInfo)
	{
		if (value == null) {
			return -1;
		} else if (anotherValueInfo == null) {
			return 1;
		} else if (value instanceof Comparable == false) {
			return -1;
		} else if (anotherValueInfo instanceof Comparable == false) {
			return 1;
		} else {
			return ((Comparable) value).compareTo(anotherValueInfo.getValue());
		}
	}

}
