SUMMARY = "Development headers for libgf2x"
DESCRIPTION = "gf2x is a library for fast multiplication of polynomials over the \
GF(2) binary field. \
 \
This package contains the interface definitions for the gf2x library."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "gf2x-devel-1.3.0-3.9.aarch64.rpm"
RPM_HASH = "ec83941a7fefb9dcb47ee20112e4c6eb20d066fa86c807b17d94f3325d52a0a9f92fe8052b9924281d9d1892c7f07226526415e729db104922c96d26abdbfcd9"

RPROVIDES:${PN} += "gf2x-devel \
pkgconfig-gf2x"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgf2x3"

inherit rpm
