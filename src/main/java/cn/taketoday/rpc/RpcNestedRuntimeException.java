/*
 * Original Author -> 杨海健 (taketoday@foxmail.com) https://taketoday.cn
 * Copyright © TODAY & 2017 - 2021 All Rights Reserved.
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

import cn.taketoday.core.NestedRuntimeException;

/**
 * @author TODAY 2021/7/4 22:42
 */
public class RpcNestedRuntimeException extends NestedRuntimeException {
  private static final long serialVersionUID = 1L;

  public RpcNestedRuntimeException() {
    super();
  }

  public RpcNestedRuntimeException(String message) {
    super(message);
  }

  public RpcNestedRuntimeException(Throwable cause) {
    super(cause);
  }

  public RpcNestedRuntimeException(String message, Throwable cause) {
    super(message, cause);
  }

}
