SUMMARY = "Development files for the GNU multiple-precision floating-point library"
DESCRIPTION = "Development files for the GNU multiple-precision floating-point library. \
 \
The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.2"

RPM_NAME = "mpfr-devel-4.2.2-1.5.aarch64.rpm"
RPM_HASH = "97c45326b94175a012ea7fad1e04048074654d06c20cb63b43a6028f9cc520295a4b2cf1115c019c40f39e9c8f10d0177ecaedaef07f576ee04c5bf62cc3edef"

RPROVIDES:${PN} += "mpfr-devel \
pkgconfig-mpfr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gmp-devel \
libmpfr6"

inherit rpm
