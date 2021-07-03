/*
 * Original Author -> 杨海健 (taketoday@foxmail.com) https://taketoday.cn
 * Copyright © TODAY & 2021 All Rights Reserved.
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see [http://www.gnu.org/licenses/]
 */

package cn.taketoday.rpc;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author TODAY 2021/7/4 01:58
 */
public abstract class RpcMethodInvoker {

  public <T> Object invoke(Class<T> serviceInterface, Method method, Object[] args) throws IOException {
    // pre
    preProcess(serviceInterface, method, args);
    // process
    Object ret = doProcess(serviceInterface, method, args);
    // post
    postProcess(ret);
    return ret;
  }

  protected abstract <T> Object doProcess(
          Class<T> serviceInterface, Method method, Object[] args) throws IOException;

  protected void preProcess(Class<?> serviceInterface, Method method, Object[] args) {
    // no-op
  }

  protected void postProcess(Object returnValue) {
    // no-op
  }
}