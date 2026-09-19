SUMMARY = "A C++ toolbox - XMLRPC package"
DESCRIPTION = "Cxxtools is a collection of general-purpose C++ classes. The library \
includes classes for serialization, unicode text, multi threading, \
networking, rpc, http client and server, xml, logging and many more."
LICENSE = "LGPL-2.1-only"

PV = "3.0"

RPM_NAME = "libcxxtools-xmlrpc10-3.0-5.1.aarch64.rpm"
RPM_HASH = "3961b2d5406bbe307d481100ea7ec973157be79101ccbf2808748aaba4c72046e5e903e8e4dbf12d255bebbd2d5097c23f1bd97ab69d959e9ef4db90e53fbb86"

RPROVIDES:${PN} += "libcxxtools-xmlrpc.so.10 \
libcxxtools-xmlrpc10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcxxtools-http.so.10 \
libcxxtools.so.10 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
