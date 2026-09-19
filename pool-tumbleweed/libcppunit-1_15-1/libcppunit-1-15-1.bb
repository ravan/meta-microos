SUMMARY = "Cppunit library for writting C++ unittests"
DESCRIPTION = "Cppunit library for writting C++ unittests in JUnit like fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "libcppunit-1_15-1-1.15.1-1.26.aarch64.rpm"
RPM_HASH = "233e9540cf5541d1d103e84f453fc2ae75049ca130154ea83026298242266fff237a257cdd903dcc414550595d6b341c2dab33f98f24f10dd27e400ea24fb4ff"

RPROVIDES:${PN} += "libcppunit-1-15-1 \
libcppunit-1.15.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
