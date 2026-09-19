SUMMARY = "Development files for gnuastro"
DESCRIPTION = "Development files required for development with GNU Astronomy \
Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.24"

RPM_NAME = "gnuastro-devel-0.24-1.5.aarch64.rpm"
RPM_HASH = "4add50773be999246fdf557cd0932ff102592060781a63ad4e1d1b4df807536c8a8926212aee4d997dc1074aeea031c3b340024eb38b760753a534382689e6a5"

RPROVIDES:${PN} += "gnuastro-devel \
pkgconfig-gnuastro"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnuastro22 \
pkgconfig-cfitsio \
pkgconfig-gsl \
pkgconfig-libgit2 \
pkgconfig-libjpeg \
pkgconfig-liblzma \
pkgconfig-libtiff-4 \
pkgconfig-wcslib"

inherit rpm
