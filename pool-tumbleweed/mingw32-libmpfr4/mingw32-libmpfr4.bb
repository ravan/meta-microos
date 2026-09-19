SUMMARY = "MPFR multiple-precision floating-point computation shared library"
DESCRIPTION = "The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.2"

RPM_NAME = "mingw32-libmpfr4-3.1.2-3.1.noarch.rpm"
RPM_HASH = "5ba86e948f6605140c713d82b3d2068a350a736a258040fddb403c76c4b4f1d196339982ee6320607b8044b5bf5f995deab8515a8af8b611d53c4a22b5f777e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libmpfr \
mingw32-libmpfr-4.dll \
mingw32-libmpfr4"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libgmp-10.dll"

inherit rpm
