/**
 * Copyright (c) 2014 Digi International Inc.,
 * All rights not expressly granted are reserved.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 * Digi International Inc. 11001 Bren Road East, Minnetonka, MN 55343
 * =======================================================================
 */
package com.digi.xbee.api;

import android.content.Context;

import com.digi.xbee.api.connection.IConnectionInterface;
import com.digi.xbee.api.connection.android.AndroidUSBPermissionListener;
import com.digi.xbee.api.connection.serial.SerialPortParameters;
import com.digi.xbee.api.exceptions.InterfaceNotOpenException;
import com.digi.xbee.api.exceptions.TimeoutException;
import com.digi.xbee.api.exceptions.XBeeDeviceException;
import com.digi.xbee.api.exceptions.XBeeException;
import com.digi.xbee.api.models.XBee16BitAddress;
import com.digi.xbee.api.models.XBee64BitAddress;
import com.digi.xbee.api.models.XBeeProtocol;

/**
 * This class represents a local DigiPoint device.
 * 
 * @see XBeeDevice
 * @see DigiMeshDevice
 * @see Raw802Device
 * @see ZigBeeDevice
 */
public class DigiPointDevice extends XBeeDevice {

	/**
	 * Class constructor. Instantiates a new {@code DigiPointDevice} object in the 
	 * given port name and baud rate.
	 * 
	 * @param port Serial port name where point-to-multipoint device is attached to.
	 * @param baudRate Serial port baud rate to communicate with the device. 
	 *                 Other connection parameters will be set as default (8 
	 *                 data bits, 1 stop bit, no parity, no flow control).
	 * 
	 * @throws IllegalArgumentException if {@code baudRate < 0}.
	 * @throws NullPointerException if {@code port == null}.
	 * 
	 * @see #DigiPointDevice(IConnectionInterface)
	 * @see #DigiPointDevice(String, SerialPortParameters)
	 * @see #DigiPointDevice(String, int, int, int, int, int)
	 * @see #DigiPointDevice(Context, int)
	 * @see #DigiPointDevice(Context, int, AndroidUSBPermissionListener)
	 */
	public DigiPointDevice(String port, int baudRate) {
		this(XBee.createConnectiontionInterface(port, baudRate));
	}
	
	/**
	 * Class constructor. Instantiates a new {@code DigiPointDevice} object in the 
	 * given serial port name and settings.
	 * 
	 * @param port Serial port name where point-to-multipoint device is attached to.
	 * @param baudRate Serial port baud rate to communicate with the device.
	 * @param dataBits Serial port data bits.
	 * @param stopBits Serial port data bits.
	 * @param parity Serial port data bits.
	 * @param flowControl Serial port data bits.
	 * 
	 * @throws IllegalArgumentException if {@code baudRate < 0} or
	 *                                  if {@code dataBits < 0} or
	 *                                  if {@code stopBits < 0} or
	 *                                  if {@code parity < 0} or
	 *                                  if {@code flowControl < 0}.
	 * @throws NullPointerException if {@code port == null}.
	 * 
	 * @see #DigiPointDevice(IConnectionInterface)
	 * @see #DigiPointDevice(String, int)
	 * @see #DigiPointDevice(String, SerialPortParameters)
	 * @see #DigiPointDevice(Context, int)
	 * @see #DigiPointDevice(Context, int, AndroidUSBPermissionListener)
	 */
	public DigiPointDevice(String port, int baudRate, int dataBits, int stopBits, int parity, int flowControl) {
		this(port, new SerialPortParameters(baudRate, dataBits, stopBits, parity, flowControl));
	}
	
	/**
	 * Class constructor. Instantiates a new {@code DigiPointDevice} object in the 
	 * given serial port name and parameters.
	 * 
	 * @param port Serial port name where point-to-multipoint device is attached to.
	 * @param serialPortParameters Object containing the serial port parameters.
	 * 
	 * @throws NullPointerException if {@code port == null} or
	 *                              if {@code serialPortParameters == null}.
	 * 
	 * @see #DigiPointDevice(IConnectionInterface)
	 * @see #DigiPointDevice(String, int)
	 * @see #DigiPointDevice(String, int, int, int, int, int)
	 * @see #DigiPointDevice(Context, int)
	 * @see #DigiPointDevice(Context, int, AndroidUSBPermissionListener)
	 * @see com.digi.xbee.api.connection.serial.SerialPortParameters
	 */
	public DigiPointDevice(String port, SerialPortParameters serialPortParameters) {
		this(XBee.createConnectiontionInterface(port, serialPortParameters));
	}
	
	/**
	 * Class constructor. Instantiates a new {@code DigiPointDevice} object for
	 * Android with the given parameters.
	 * 
	 * @param context The Android context.
	 * @param baudRate The USB connection baud rate.
	 * 
	 * @throws IllegalArgumentException if {@code baudRate < 1}.
	 * @throws NullPointerException if {@code context == null}.
	 * 
	 * @see #DigiPointDevice(IConnectionInterface)
	 * @see #DigiPointDevice(String, int)
	 * @see #DigiPointDevice(String, SerialPortParameters)
	 * @see #DigiPointDevice(String, int, int, int, int, int)
	 * @see #DigiPointDevice(Context, int, AndroidUSBPermissionListener)
	 */
	public DigiPointDevice(Context context, int baudrate) {
		super(XBee.createConnectiontionInterface(context, baudrate));
	}
	
	/**
	 * Class constructor. Instantiates a new {@code DigiPointDevice} object for
	 * Android with the given parameters.
	 * 
	 * @param context The Android context.
	 * @param baudRate The USB connection baud rate.
	 * @param permissionListener The USB permission listener that will be 
	 *                           notified when user grants USB permissions.
	 * 
	 * @throws IllegalArgumentException if {@code baudRate < 1}.
	 * @throws NullPointerException if {@code context == null}.
	 * 
	 * @see #DigiPointDevice(IConnectionInterface)
	 * @see #DigiPointDevice(String, int)
	 * @see #DigiPointDevice(String, SerialPortParameters)
	 * @see #DigiPointDevice(String, int, int, int, int, int)
	 * @see #DigiPointDevice(Context, int)
	 * @see com.digi.xbee.api.connection.android.AndroidUSBPermissionListener
	 */
	public DigiPointDevice(Context context, int baudrate, AndroidUSBPermissionListener permissionListener) {
		super(XBee.createConnectiontionInterface(context, baudrate, permissionListener));
	}
	
	/**
	 * Class constructor. Instantiates a new {@code DigiPointDevice} object with the 
	 * given connection interface.
	 * 
	 * @param connectionInterface The connection interface with the physical 
	 *                            point-to-multipoint device.
	 * 
	 * @throws NullPointerException if {@code connectionInterface == null}
	 * 
	 * @see #DigiPointDevice(String, int)
	 * @see #DigiPointDevice(String, SerialPortParameters)
	 * @see #DigiPointDevice(String, int, int, int, int, int)
	 * @see #DigiPointDevice(Context, int)
	 * @see #DigiPointDevice(Context, int, AndroidUSBPermissionListener)
	 * @see com.digi.xbee.api.connection.IConnectionInterface
	 */
	public DigiPointDevice(IConnectionInterface connectionInterface) {
		super(connectionInterface);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.digi.xbee.api.XBeeDevice#open()
	 */
	@Override
	public void open() throws XBeeException {
		super.open();
		if (isRemote())
			return;
		if (xbeeProtocol != XBeeProtocol.DIGI_POINT)
			throw new XBeeDeviceException("XBee device is not a " + getXBeeProtocol().getDescription() + " device, it is a " + xbeeProtocol.getDescription() + " device.");
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.digi.xbee.api.XBeeDevice#getNetwork()
	 */
	@Override
	public XBeeNetwork getNetwork() {
		if (!isOpen())
			throw new InterfaceNotOpenException();
		
		if (network == null)
			network = new DigiPointNetwork(this);
		return network;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.digi.xbee.api.XBeeDevice#getXBeeProtocol()
	 */
	@Override
	public XBeeProtocol getXBeeProtocol() {
		return XBeeProtocol.DIGI_POINT;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.digi.xbee.api.XBeeDevice#sendDataAsync(com.digi.xbee.api.models.XBee64BitAddress, com.digi.xbee.api.models.XBee16BitAddress, byte[])
	 */
	@Override
	public void sendDataAsync(XBee64BitAddress address64Bit, XBee16BitAddress address16bit, byte[] data) throws XBeeException {
		super.sendDataAsync(address64Bit, address16bit, data);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.digi.xbee.api.XBeeDevice#sendData(com.digi.xbee.api.models.XBee64BitAddress, com.digi.xbee.api.models.XBee16BitAddress, byte[])
	 */
	@Override
	protected void sendData(XBee64BitAddress address64Bit, XBee16BitAddress address16bit, byte[] data) throws TimeoutException, XBeeException {
		super.sendData(address64Bit, address16bit, data);
	}
}
