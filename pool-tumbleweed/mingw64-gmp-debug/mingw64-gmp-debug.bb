SUMMARY = "Debug information for package mingw64-gmp"
DESCRIPTION = "This package provides debug information for package mingw64-gmp. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-gmp-debug-6.1.1-4.1.noarch.rpm"
RPM_HASH = "223614f4986f86c2aeb91e73eb3fcc0c349b2db8506df9ceac07b603797e11c03d2f46c27e0b3aa3095e2d8a3b7e5ce4ab2e940a0ff67ae01dd34e04a5624748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gmp-debug"

RDEPENDS:${PN} += ""

inherit rpm
