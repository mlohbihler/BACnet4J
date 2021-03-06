/*
 * ============================================================================
 * GNU General Public License
 * ============================================================================
 *
 * Copyright (C) 2015 Infinite Automation Software. All rights reserved.
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
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * When signing a commercial license with Infinite Automation Software,
 * the following extension to GPL is made. A special exception to the GPL is
 * included to allow you to distribute a combined work that includes BAcnet4J
 * without being obliged to provide the source code for any proprietary components.
 *
 * See www.infiniteautomation.com for commercial license options.
 * 
 * @author Matthew Lohbihler
 */
package com.serotonin.bacnet4j.util.sero;

import java.io.IOException;

import jssc.SerialPort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Terry Packer
 */
public class JsscSerialPortOutputStream extends SerialPortOutputStream {
    static final Logger LOG = LoggerFactory.getLogger(JsscSerialPortOutputStream.class);
    private final SerialPort port;

    public JsscSerialPortOutputStream(SerialPort port) {
        this.port = port;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.OutputStream#write(int)
     */
    @Override
    public void write(int arg0) throws IOException {
        try {
            byte b = (byte) arg0;
            if (LOG.isDebugEnabled())
                LOG.debug("Writing byte: " + String.format("%02x", b));
            if ((port != null) && (port.isOpened())) {
                port.writeByte(b);
            }
        }
        catch (jssc.SerialPortException e) {
            throw new IOException(e);
        }
    }

    @Override
    public void flush() {
        if (LOG.isDebugEnabled())
            LOG.debug("Called no-op flush...");
        //Nothing yet
    }

}
