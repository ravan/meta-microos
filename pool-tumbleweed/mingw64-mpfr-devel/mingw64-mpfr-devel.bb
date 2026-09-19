SUMMARY = "MPFR multiple-precision floating-point library development files"
DESCRIPTION = "MPFR multiple-precision floating-point library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "mingw64-mpfr-devel-3.1.4-3.1.noarch.rpm"
RPM_HASH = "ffdf915e2b2b07faf733d3a8e9904935e426ff7612b9042fc1fa1fc81dd979ecafda79fb31a2784d583dc5701f73078e6a50fbd485153c12af2a7dbbf2c945ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-mpfr \
mingw64-mpfr-devel"

RDEPENDS:${PN} += "mingw64-lib-gmp"

inherit rpm
