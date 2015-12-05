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
import com.netcrest.pado.info.message.GridStatusInfo;

public class GemfireGridStatusInfo extends GridStatusInfo implements DataSerializable
{
	private static final long serialVersionUID = 1L;

	public GemfireGridStatusInfo()
	{
	}

	public GemfireGridStatusInfo(Status status, String gridId, String masterId, String serverId, String message)
	{
		super(status, gridId, masterId, serverId, message);
	}

	/**
	 * Reads the state of this object from the given <code>DataInput</code>.
	 * 
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public void fromData(DataInput input) throws IOException, ClassNotFoundException
	{
		status = DataSerializer.readEnum(Status.class, input);
		gridId = DataSerializer.readString(input);
		masterId = DataSerializer.readObject(input);
		serverId = DataSerializer.readObject(input);
		message = DataSerializer.readString(input);
		serverInfoList = DataSerializer.readObject(input);
	}

	/**
	 * Writes the state of this object to the given <code>DataOutput</code>.
	 * 
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public void toData(DataOutput output) throws IOException
	{
		DataSerializer.writeEnum(status, output);
		DataSerializer.writeString(gridId, output);
		DataSerializer.writeObject(masterId, output);
		DataSerializer.writeObject(serverId, output);
		DataSerializer.writeString(message, output);
		DataSerializer.writeObject(serverInfoList, output);
	}
}
