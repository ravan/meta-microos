SUMMARY = "C++ Interface for D-Bus"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-1-1-0.9.1+git20170322-5.9.aarch64.rpm"
RPM_HASH = "2287160ac067e288cccb5e3edee3a330979915862b66753145e969136da10b505f383458ecb0c876afbf23812c61906ab702fd94aaa46eb5643387627ef18c67"

RPROVIDES:${PN} += "libdbus-c++-1-1 \
libdbus-c++-1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
