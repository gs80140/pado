#!/bin/bash

# ========================================================================
# Copyright (c) 2013-2015 Netcrest Technologies, LLC. All rights reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
# ========================================================================

pushd .. > /dev/null 2>&1
. ./setenv.sh > /dev/null 2>&1
. ./all_env.sh > /dev/null 2>&1
. ./argenv.sh > /dev/null 2>&1
popd > /dev/null 2>&1

#
# Append all jar files found in the $BASE_DIR/plugins directory and
# its subdirectories in the class path. 
#
PLUGINS_JARS=
for file in `find $BASE_DIR/plugins -name *.jar`
do
  if [ "${PLUGINS_JARS}" ]; then
    PLUGINS_JARS=${PLUGINS_JARS}:${file}
  else
    PLUGINS_JARS=${file}
  fi
done
if [ "${PLUGINS_JARS}" ]; then
  export CLASSPATH=${PLUGINS_JARS}:${CLASSPATH}
fi
