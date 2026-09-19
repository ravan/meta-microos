SUMMARY = "MPC multiple-precision complex library development files"
DESCRIPTION = "MPC is a C library for the arithmetic of complex numbers with \
arbitrarily high precision and correct rounding of the result. This \
package contains the library development files."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw64-mpc-devel-1.0.2-3.9.noarch.rpm"
RPM_HASH = "b7ada1d22e5d60e9eea986e67acddf955d97866648bfaf8709c99547d23db26a3b8ac319f9431228c34755b8c2b90099ff1e2053a0827f45615104c2451ce047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-lib-mpc \
mingw64-mpc-devel"

RDEPENDS:${PN} += "mingw64-lib-mpfr"

inherit rpm
