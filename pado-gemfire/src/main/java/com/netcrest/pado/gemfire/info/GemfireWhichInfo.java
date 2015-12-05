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

import com.gemstone.gemfire.DataSerializable;
import com.gemstone.gemfire.DataSerializer;
import com.netcrest.pado.info.BucketInfo;
import com.netcrest.pado.info.WhichInfo;

public class GemfireWhichInfo extends WhichInfo implements DataSerializable
{
	private static final long serialVersionUID = 1L;

	public GemfireWhichInfo()
	{}
	
	public GemfireWhichInfo(Object key, Object actualKey, Object value, boolean isPartitioend, BucketInfo bucketInfo)
	{
		this.key = key;
		this.actualKey = actualKey;
		this.value = value;
		this.isPartitioned = isPartitioend;
		this.bucketInfo = bucketInfo;
	}
	
	/**
	 * Reads the state of this object from the given <code>DataInput</code>.
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public void fromData(DataInput input) throws IOException, ClassNotFoundException
	{
		gridId = DataSerializer.readString(input);
		serverName = DataSerializer.readString(input);
		serverId = DataSerializer.readString(input);
		host = DataSerializer.readString(input);
		key = DataSerializer.readObject(input);
		actualKey = DataSerializer.readObject(input);
		value = DataSerializer.readObject(input);
		isPartitioned = DataSerializer.readPrimitiveBoolean(input);
		bucketInfo = DataSerializer.readObject(input);
	}

	/**
	 * Writes the state of this object to the given <code>DataOutput</code>.
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public void toData(DataOutput output) throws IOException
	{
		DataSerializer.writeString(gridId, output);
		DataSerializer.writeString(serverName, output);
		DataSerializer.writeString(serverId, output);
		DataSerializer.writeString(host, output);
		DataSerializer.writeObject(key, output);
		DataSerializer.writeObject(actualKey, output);
		DataSerializer.writeObject(value, output);
		DataSerializer.writePrimitiveBoolean(isPartitioned, output);
		DataSerializer.writeObject(bucketInfo, output);
	}
}
