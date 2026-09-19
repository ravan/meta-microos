SUMMARY = "WS-discovery client library"
DESCRIPTION = "This package contains the main library implementing a client for the \
Web Services Dynamic Discovery (WS-Discovery) protocol, used to discover \
services on a local network."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "libKDSoapWSDiscoveryClient0-0.4.0-1.6.aarch64.rpm"
RPM_HASH = "f6bcef737fb3a23f26dba56970a4d1299ceb063608911a2ff2bf3b232efa38a53808dcca2826ef1c73dc9ac02d949d80bd2caec577d68e4806563018784aba11"

RPROVIDES:${PN} += "libKDSoapWSDiscoveryClient.so.0 \
libKDSoapWSDiscoveryClient0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libkdsoap-qt6.so.2 \
libstdc++.so.6"

inherit rpm
