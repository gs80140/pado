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
package com.netcrest.pado.test.biz;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

import com.netcrest.pado.IBizFuture;
import com.netcrest.pado.annotation.BizFuture;
import com.netcrest.pado.annotation.BizMethod;

@BizFuture(bizInterface="com.netcrest.pado.test.biz.IPartitionedRegionBiz")
public interface IPartitionedRegionBizFuture extends IBizFuture
{
	@BizMethod
	Future<int[]> getBucketIds();
	
	@BizMethod
	Future<Map<String, String>> getBucketMap(int bucketId);
	
	@BizMethod
	void putEntry(String key, String value);
	
	@BizMethod
	Future<List<String>> getServerIdList();
}
