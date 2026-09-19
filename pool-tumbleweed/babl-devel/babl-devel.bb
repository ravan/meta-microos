SUMMARY = "Dynamic Pixel Format Translation Library"
DESCRIPTION = "babl is a dynamic, any to any, pixel format translation library."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.128"

RPM_NAME = "babl-devel-0.1.128-1.1.aarch64.rpm"
RPM_HASH = "996bbae5cf95bee0d9d0ff77dee9901519b1534287fd0c2058f2b97fa479c93e722abfd8187e8c6fc4d92f7cd66db041bfde5f9eea3d7b7d314ef32f00ade79c"

RPROVIDES:${PN} += "babl-devel \
pkgconfig-babl-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
ld-linux-aarch64.so.1 \
libbabl-0-1-0 \
libbabl-0.1.so.0 \
libc.so.6 \
pkgconfig-lcms2 \
typelib-1-0-Babl-0-1"

inherit rpm
