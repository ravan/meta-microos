SUMMARY = "C++ client for Redis"
DESCRIPTION = "Redis-plus-plus, a C++ client for Redis based on hiredis and written in C++11/C++17."
LICENSE = "Apache-2.0"

PV = "1.3.15"

RPM_NAME = "libredis++1-1.3.15-1.3.aarch64.rpm"
RPM_HASH = "85b0415803774f62a01a0228b05d312afc379b1452280fab35e1fe1a38889226398dd5b4ae2115d04916d13ac79feb49ac2ae231863d64a3de428f5e0059b310"

RPROVIDES:${PN} += "libredis++.so.1 \
libredis++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhiredis-ssl.so.1.3.0 \
libhiredis.so.1.3.0 \
libstdc++.so.6 \
libuv.so.1"

inherit rpm
