SUMMARY = "Development files for GtkDatabox"
DESCRIPTION = "The libgtkdatabox-devel package contains libraries, header files and \
documentation for developing applications that use libgtkdatabox."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "gtkdatabox-devel-1.0.0-1.21.aarch64.rpm"
RPM_HASH = "a4141818828e7a7d49c4609dc71e1c12c9e3568e660b1852618f53a110fdb16cdde01fe9263c6789625571efc1691416a21c5c8b76d971c2958b5caf01b947b6"

RPROVIDES:${PN} += "gtkdatabox-devel \
pkgconfig-gtkdatabox"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkdatabox1 \
pkgconfig-cairo \
pkgconfig-gtk+-3.0 \
pkgconfig-pango"

inherit rpm
