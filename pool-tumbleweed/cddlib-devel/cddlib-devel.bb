SUMMARY = "Header files for cddlib"
DESCRIPTION = "cddlib is a C implementation of the Double Description Method of \
Motzkin et al. for generating all vertices (i.e. extreme points) and \
extreme rays of a general convex polyhedron in R^d given by a system \
of linear inequalities. \
 \
This package contains the headers for the C library."
LICENSE = "GPL-2.0-or-later"

PV = "0.94n"

RPM_NAME = "cddlib-devel-0.94n-1.5.aarch64.rpm"
RPM_HASH = "8b46addec4e658596b29e3057a0799623caf560eb7aeeaaf2d5c6eb6b91bb3203325031c9a80f7505283797ca2837d1d97fd7f450e7acd2fa256f8d3cb91e64c"

RPROVIDES:${PN} += "cddlib-devel \
pkgconfig-cddgmp \
pkgconfig-cddlib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gmp-devel \
libcdd0"

inherit rpm
