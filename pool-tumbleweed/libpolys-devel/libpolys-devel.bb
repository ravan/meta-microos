SUMMARY = "Development files for Singular's POLYS library"
DESCRIPTION = "Data structures and basic algorithms for polynomials \
in Singular"
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libpolys-devel-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "458278ea373f7d0fd46a9f0711ffa1553f3666cedb64837be32b50c4e74a2c90af9487559ab8eefdd9c20a98c7f17adc1b2077850abb2852ce602f015768c679"

RPROVIDES:${PN} += "libpolys-devel \
pkgconfig-libpolys"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSingular-devel \
libpolys-4-4-1 \
pkgconfig-factory \
pkgconfig-omalloc \
pkgconfig-singular-resources"

inherit rpm
