SUMMARY = "Library for handling Apple Binary and XML Property Lists -- Development Files"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists. \
 \
This package contains the development files for C++."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.6.0"

RPM_NAME = "libplist++-2_0-devel-2.6.0-3.6.aarch64.rpm"
RPM_HASH = "f944b0ae225523e04019d4d892ea864545efb3350333e49a6220bbee526fb79e6e51f21c95ed4b5e92593ae396be198df47c31d32d4cc062998421897a701a22"

RPROVIDES:${PN} += "libplist++-2-0-devel \
libplist++-devel \
pkgconfig-libplist++-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplist++-2-0-4 \
pkgconfig-libplist-2.0"

inherit rpm
