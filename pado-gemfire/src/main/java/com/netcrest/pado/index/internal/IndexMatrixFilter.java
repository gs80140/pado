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
package com.netcrest.pado.index.internal;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import com.gemstone.gemfire.DataSerializable;
import com.gemstone.gemfire.DataSerializer;
import com.netcrest.pado.index.provider.IndexInfo;

/**
 * IndexMatrixFilter is used for function invocation.
 */
public class IndexMatrixFilter implements DataSerializable
{
	private static final long serialVersionUID = 1L;
	private Object id;
	private int bucketId;
	private int startIndex;
	private int endIndex;

	public IndexMatrixFilter()
	{}
	
	public IndexMatrixFilter(Object id, IndexInfo indexInfo)
	{
		this(id, indexInfo.getBucketId(), indexInfo.getIndex(), indexInfo.getIndex());
	}
	
	public IndexMatrixFilter(Object id, int bucketId, int startIndex, int endIndex)
	{
		this.id = id;
		this.bucketId = bucketId;
		this.startIndex = startIndex;
		this.endIndex = endIndex;
	}

	public Object getId()
	{
		return id;
	}

	public void setId(Object id)
	{
		this.id = id;
	}

	public int getBucketId()
	{
		return bucketId;
	}

	public void setBucketId(int bucketId)
	{
		this.bucketId = bucketId;
	}

	public int getStartIndex()
	{
		return startIndex;
	}

	public void setStartIndex(int startIndex)
	{
		this.startIndex = startIndex;
	}

	public int getEndIndex()
	{
		return endIndex;
	}

	public void setEndIndex(int endIndex)
	{
		this.endIndex = endIndex;
	}
	
	/**
	 * Returns the hash code of this object.
	 * 
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public int hashCode()
	{
		return bucketId;
	}

	/**
	 * Returns true if the specified object equals this object.
	 * 
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IndexMatrixFilter other = (IndexMatrixFilter) obj;
		return bucketId == other.bucketId;
	}

	/**
	 * Reads the state of this object from the given <code>DataInput</code>.
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public void fromData(DataInput input) throws IOException, ClassNotFoundException
	{
		id = DataSerializer.readObject(input);
		bucketId = DataSerializer.readPrimitiveInt(input);
		startIndex = DataSerializer.readPrimitiveInt(input);
		endIndex = DataSerializer.readPrimitiveInt(input);
	}

	/**
	 * Writes the state of this object to the given <code>DataOutput</code>.
	 * @gfcodegen This code is generated by gfcodegen.
	 */
	public void toData(DataOutput output) throws IOException
	{
		DataSerializer.writeObject(id, output);
		DataSerializer.writePrimitiveInt(bucketId, output);
		DataSerializer.writePrimitiveInt(startIndex, output);
		DataSerializer.writePrimitiveInt(endIndex, output);
	}

	
}
