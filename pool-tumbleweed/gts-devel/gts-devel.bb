SUMMARY = "Development files and documentation for GTS"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that use GTS."
LICENSE = "LGPL-2.0+"

PV = "0.7.6_p20121130"

RPM_NAME = "gts-devel-0.7.6_p20121130-4.41.aarch64.rpm"
RPM_HASH = "4534d49f0febe9f962f4acfaa27245ba7a6693aa5bc4fb27b961d59284a6430ca5fde162d479e501e565efe9af678cb614608e05655b086baca34afd3c42564e"

RPROVIDES:${PN} += "gts-devel \
pkgconfig-gts"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gcc \
gcc-c++ \
glib2-devel \
gts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgts-0-7-5 \
libgts-0.7.so.5 \
libnetpbm.so.11 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gthread-2.0"

inherit rpm
