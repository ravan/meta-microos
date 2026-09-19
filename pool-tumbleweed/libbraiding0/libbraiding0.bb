SUMMARY = "Library for computations on braid groups"
DESCRIPTION = "CBraid is a C++ library for various computations on braid groups, \
such as normal forms."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libbraiding0-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "511c6956bfb82c282e54703071691de3b1f1f25d9b4e5e4e285f4bf778986efe7fb9b6c8b67c6a95b7e44b74c034a8137b7f08bb00bb670673ebe77f4eadff66"

RPROVIDES:${PN} += "libbraiding.so.0 \
libbraiding0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
