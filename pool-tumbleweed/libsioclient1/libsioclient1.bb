SUMMARY = "Socket.IO C++ Client"
DESCRIPTION = "C++11 implementation of Socket.IO client"
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "libsioclient1-3.1.0-2.5.aarch64.rpm"
RPM_HASH = "43f1f5da4177ee69e169ec7d15bcf5e71d8605368370406735b8da07a0a0f67cdb6bebb7d55a97a29ce0211354acf7c037e8037048843c00600f420b700dad04"

RPROVIDES:${PN} += "libsioclient-tls.so.1 \
libsioclient.so.1 \
libsioclient1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
