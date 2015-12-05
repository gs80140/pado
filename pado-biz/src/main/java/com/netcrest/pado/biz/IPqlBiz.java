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
package com.netcrest.pado.biz;

import java.util.List;

import com.netcrest.pado.IBiz;
import com.netcrest.pado.annotation.BizClass;
import com.netcrest.pado.annotation.BizMethod;
import com.netcrest.pado.annotation.OnPath;
import com.netcrest.pado.annotation.OnServer;

/**
 * IPqlBiz executes PQL. IPqlBiz is currently experimental and not supported.
 * Its behavior is subject to change. Please use {@linkplain IIndexMatrixBiz}
 * instead.
 * <p>
 * <b>Arguments: None</b>
 * <p>
 * 
 * @author dpark
 * 
 */
@BizClass(name = "IPqlBiz")
public interface IPqlBiz extends IBiz
{
	@BizMethod
	@OnServer(broadcast = true, broadcastGrids = true)
	public List<?> executePql(String pql);

	@BizMethod
	@OnPath
	// @WithGridCollector(gridCollectorClass="com.netcrest.pado.biz.collector.CollectionCollector")
	public List<?> executeGemfireOql(String oql);

	@BizMethod
	@OnServer(broadcast = true, broadcastGrids = true)
	public List<?> executeLuceneQuery(String gridPath, String luceneQuery);
}
