/**
 * Copyright (C) 2010-2011, FuseSource Corp.  All rights reserved.
 *
 *     http://fusesource.com
 *
 * The software in this package is published under the terms of the
 * CDDL license a copy of which has been included with this distribution
 * in the license.txt file.
 */

package org.fusesource.fabric.apollo.amqp.codec;

import org.fusesource.fabric.apollo.amqp.codec.types.AmqpType;

/**
 *
 */
public interface AmqpHandler extends AmqpCommandHandler {

    public void handleProtocolHeader(AmqpProtocolHeader protocolHeader) throws Exception;

    public void handleEmpty() throws Exception;

    public void handleUnknown(AmqpType<?, ?> body) throws Exception;

}