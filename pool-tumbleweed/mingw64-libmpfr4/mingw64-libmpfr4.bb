SUMMARY = "MPFR multiple-precision floating-point computation shared library"
DESCRIPTION = "The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "mingw64-libmpfr4-3.1.4-3.1.noarch.rpm"
RPM_HASH = "aa141f8aa509cc262308b15fa4c83fb481f372b64b9ad6064b6a2d0ffdef700878dfbc67f58d7d776adc9570f5c05d049eb656a4503e7ebb0d1e5ffe413de464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libmpfr \
mingw64-libmpfr-4.dll \
mingw64-libmpfr4"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libgmp-10.dll"

inherit rpm
