SUMMARY = "Development files for libdbus-c++"
DESCRIPTION = "DBus-c++ provides a C++ API for D-BUS. The library has \
a glib and an ecore mainloop integration. It also offers an \
optional own main loop. \
This subpackage contains the files needed for building against \
libdbus-c++."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.1+git20170322"

RPM_NAME = "libdbus-c++-glib-devel-0.9.1+git20170322-5.8.aarch64.rpm"
RPM_HASH = "5b3b3d970e50a9f5f02bcabcf30552f762590acb2c5d75d73312c5210996c11fa64140357e72961dc40fdbf983afa3692c2be4eeb26141a697cb253922901f83"

RPROVIDES:${PN} += "libdbus-c++-glib-devel \
pkgconfig-dbus-c++-glib-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbus-c++-glib-1-1 \
pkgconfig-dbus-c++-1"

inherit rpm
