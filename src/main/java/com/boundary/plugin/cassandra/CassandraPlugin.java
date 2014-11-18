// Copyright 2014 Boundary, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.boundary.plugin.cassandra;

import com.boundary.plugin.sdk.Plugin;
import com.boundary.plugin.sdk.PluginConfiguration;
import com.boundary.plugin.sdk.PluginDispatcher;

public class CassandraPlugin implements Plugin {
	
	PluginConfiguration<CassandraConfiguration> configuration;
	PluginDispatcher dispatcher;

	public void run() {
		
	}

	public void setConfiguration(PluginConfiguration<?> configuration) {
		this.configuration = (PluginConfiguration<CassandraConfiguration>)configuration;
	}

	public void setDispatcher(PluginDispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}

}
