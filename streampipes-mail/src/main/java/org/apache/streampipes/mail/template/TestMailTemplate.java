/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.apache.streampipes.mail.template;

import j2html.tags.ContainerTag;

import static j2html.TagCreator.div;

public class TestMailTemplate extends AbstractMailTemplate{


  public static void main(String[] args) {

    String test = new AccountActiviationMailTemplate("asd").generateTemplate();
    System.out.println(test);
  }

  @Override
  protected String getTitle() {
    return "Mail settings verification";
  }

  @Override
  protected ContainerTag getContent() {
    return div().withText("This is a test mail").withClass("mail-body-text");
  }
}