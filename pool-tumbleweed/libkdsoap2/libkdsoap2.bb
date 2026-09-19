SUMMARY = "A Qt-based client-side and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides the library for the client-side component."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "libkdsoap2-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "912965a4390ff55b374c4d38e729236d3197500da18fb610ae932076fe56a250ad5c4ebbacda60cfe83eb05f3e1a5ff2864bef0ce53fb4b6d0f67c7066c72a15"

RPROVIDES:${PN} += "libkdsoap.so.2 \
libkdsoap2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
