/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.gearpump.streaming.javaapi;

import io.gearpump.partitioner.Partitioner;

public class Graph extends io.gearpump.util.Graph<io.gearpump.streaming.Processor, Partitioner> {

  public Graph() {
    super(null, null);
  }

  @Override
  public void addVertex(io.gearpump.streaming.Processor vertex) {
    super.addVertex(vertex);
  }

  @Override
  public void addEdge(
      io.gearpump.streaming.Processor node1,
      Partitioner edge,
      io.gearpump.streaming.Processor node2) {
    super.addEdge(node1, edge, node2);
  }
}