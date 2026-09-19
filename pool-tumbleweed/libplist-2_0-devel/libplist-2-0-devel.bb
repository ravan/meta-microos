SUMMARY = "Library for handling Apple Binary and XML Property Lists -- Development Files"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains the development files for C."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "libplist-2_0-devel-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "6b640fcdd4747db020485d5b53d195c783d95a1777933c335564f46489be3636b1da934056e2dbfd62d6b61a4adbeee68d0fc27658f18a154588b7462d385366"

RPROVIDES:${PN} += "libplist-2-0-devel \
libplist-devel \
pkgconfig-libplist-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplist-2-0-4"

inherit rpm
