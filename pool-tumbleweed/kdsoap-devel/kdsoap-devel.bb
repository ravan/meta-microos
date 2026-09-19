SUMMARY = "Development files for kdsoap, a Qt-based client and server-side SOAP component"
DESCRIPTION = "KD Soap is a Qt-based client-side and server-side SOAP component. \
This package provides development headers to use KD Soap in Qt based \
applications."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "kdsoap-devel-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "28f8ba54445c8ac3790569ee1fb4d55872de7196f7f40bdc48fe5951e5d2f87ce597f0770cacbc236cf198e26300dd7eff3b2303e0e35476b36b01be20fdc5bd"

RPROVIDES:${PN} += "cmake-KDSoap \
kdsoap-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkdsoap-server2 \
libkdsoap2 \
libstdc++.so.6"

inherit rpm
