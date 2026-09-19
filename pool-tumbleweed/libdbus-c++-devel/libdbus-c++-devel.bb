SUMMARY = "Development files for libdbus-c++"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop. \
This subpackage contains the files needed for building against \
libdbus-c++."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-devel-0.9.1+git20170322-5.9.aarch64.rpm"
RPM_HASH = "0b7deacd83e5badf8f030289b4266fbe9227e6956d98783ae1926bbb493ec91166c776e58e6dfa7f8c1c4de463a5ee6ce3fac838290e467655b13a2d4f385519"

RPROVIDES:${PN} += "libdbus-c++-devel \
pkgconfig-dbus-c++-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-c++-1-1 \
libdbus-c++-1.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
pkgconfig-dbus-1"

inherit rpm
