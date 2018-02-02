package com.dtc.cordova.RestHttpd.Dserver;

import java.io.IOException;
import java.net.InetSocketAddress;

public class WebServer extends NanoHTTPD
{
	
	public WebServer(InetSocketAddress localAddr, AndroidFile wwwroot, Dserver s) throws IOException {
		super(localAddr, wwwroot, s);
	}

	public WebServer(int port, AndroidFile wwwroot, Dserver s ) throws IOException {
		super(port, wwwroot, s);
	}
}
