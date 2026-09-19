SUMMARY = "MPFR multiple-precision floating-point library development files"
DESCRIPTION = "MPFR multiple-precision floating-point library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.2"

RPM_NAME = "mingw32-mpfr-devel-3.1.2-3.1.noarch.rpm"
RPM_HASH = "7057d40f2031e7ee460918a780f9ec4d3dac071e40d2f333691fc41ed1e7c8156814e04966078842ce7420079a9fb4b3bf4da44a384284a31447cb8c6eb914df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-mpfr \
mingw32-mpfr-devel"

RDEPENDS:${PN} += "mingw32-lib-gmp"

inherit rpm
