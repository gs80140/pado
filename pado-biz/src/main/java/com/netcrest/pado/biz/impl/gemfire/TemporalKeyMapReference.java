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
package com.netcrest.pado.biz.impl.gemfire;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Map;

import com.gemstone.gemfire.DataSerializable;
import com.gemstone.gemfire.DataSerializer;
import com.netcrest.pado.data.KeyMap;
import com.netcrest.pado.data.KeyMapReference;
import com.netcrest.pado.temporal.ITemporalData;
import com.netcrest.pado.temporal.gemfire.impl.GemfireTemporalData;

public class TemporalKeyMapReference<V> extends KeyMapReference<V> implements DataSerializable
{
	private static final long serialVersionUID = 1L;
	
	// data is expected to contain KeyMap value
	private ITemporalData<V> data;

	public TemporalKeyMapReference()
	{
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public TemporalKeyMapReference(ITemporalData<V> temporalData, Map<String, Object>referenceMap)
	{
		this.data = temporalData;
		data.__getTemporalValue().deserializeAll();
		if (data instanceof GemfireTemporalData) {
			GemfireTemporalData gtd = (GemfireTemporalData)data;
			Object value = gtd.getValue();
			if (value instanceof KeyMap) {
				KeyMap keyMap = (KeyMap)value;
				init(keyMap, referenceMap);
			}
		}
	}

	/**
	 * Reads the state of this object from the given <code>DataInput</code>.
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public void fromData(DataInput input) throws IOException, ClassNotFoundException
	{
		data = DataSerializer.readObject(input);
		super.setReferenceMap((Map)DataSerializer.readObject(input));
	}

	/**
	 * Writes the state of this object to the given <code>DataOutput</code>.
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public void toData(DataOutput output) throws IOException
	{
		DataSerializer.writeObject(data, output);
		DataSerializer.writeObject(super.getReferenceMap(), output);
	}
}
