SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the server-side component."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "libkdsoap-server2-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "a53ee1dda6ea2f7819cf65186183270b75cf990d9fd33f9330bc9cdf3a41413cad200c3297606ce0eb8b9f703da0e907a99019e6ba102ace99e6b97b5c76e18c"

RPROVIDES:${PN} += "libkdsoap-server.so.2 \
libkdsoap-server2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkdsoap.so.2 \
libstdc++.so.6"

inherit rpm
