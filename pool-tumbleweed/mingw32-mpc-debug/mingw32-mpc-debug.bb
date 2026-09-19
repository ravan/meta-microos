SUMMARY = "Debug information for package mingw32-mpc"
DESCRIPTION = "This package provides debug information for package mingw32-mpc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw32-mpc-debug-1.0.2-3.9.noarch.rpm"
RPM_HASH = "ded0fecff5264e7a64bbc5db07019d161ad195b16638e9c533f6709cec83fad75afa42ceb062ccdcc515aefd06d29bde4fc4e28c8ec9167346ba2df94aad3b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-mpc-debug"

RDEPENDS:${PN} += ""

inherit rpm
