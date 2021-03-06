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
package com.netcrest.pado.gemfire.info;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Set;

import com.gemstone.gemfire.DataSerializable;
import com.gemstone.gemfire.DataSerializer;
import com.netcrest.pado.gemfire.util.DataSerializerEx;
import com.netcrest.pado.info.GridPathInfo;

public class GemfireGridPathInfo extends GridPathInfo implements DataSerializable
{
	private static final long serialVersionUID = 1L;

	public GemfireGridPathInfo()
	{
		this(null);
	}

	public GemfireGridPathInfo(String gridPath)
	{
		super(gridPath);
	}

	@Override
	public String toString()
	{
		return "GemfireGridPathInfo [gridPath=" + gridPath + ", inherit=" + inherit + ", dataType=" + dataType
				+ ", accessType=" + accessType + ", gridIdSet=" + gridIdSet + ", temporalEnabled=" + temporalEnabled
				+ ", luceneEnabled=" + luceneEnabled + ", keyClassName=" + keyClassName + ", dataClassName="
				+ dataClassName + ", routerClassName=" + routerClassName + ", description=" + description + "]";
	}

	/**
	 * Reads the state of this object from the given <code>DataInput</code>.
	 * 
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void fromData(DataInput input) throws IOException, ClassNotFoundException
	{
		gridPath = DataSerializerEx.readUTF(input);
		inherit = DataSerializer.readPrimitiveBoolean(input);
		dataType = DataSerializer.readEnum(DataType.class, input);
		accessType = DataSerializer.readEnum(AccessType.class, input);
		gridIdSet = (Set<String>) DataSerializer.readObject(input);
		temporalEnabled = DataSerializer.readPrimitiveBoolean(input);
		luceneEnabled = DataSerializer.readPrimitiveBoolean(input);
		keyClassName = DataSerializerEx.readUTF(input);
		dataClassName = DataSerializerEx.readUTF(input);
		routerClassName = DataSerializerEx.readUTF(input);
		description = DataSerializerEx.readUTF(input);
	}

	/**
	 * Writes the state of this object to the given <code>DataOutput</code>.
	 * 
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	@Override
	public void toData(DataOutput output) throws IOException
	{
		DataSerializerEx.writeUTF(gridPath, output);
		DataSerializer.writePrimitiveBoolean(inherit, output);
		DataSerializer.writeEnum(dataType, output);
		DataSerializer.writeEnum(accessType, output);
		DataSerializer.writeObject(gridIdSet, output);
		DataSerializer.writePrimitiveBoolean(temporalEnabled, output);
		DataSerializer.writePrimitiveBoolean(luceneEnabled, output);
		DataSerializerEx.writeUTF(keyClassName, output);
		DataSerializerEx.writeUTF(dataClassName, output);
		DataSerializerEx.writeUTF(routerClassName, output);
		DataSerializerEx.writeUTF(description, output);
	}
}
