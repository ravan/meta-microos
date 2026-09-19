SUMMARY = "Debug information for package mingw32-binutils"
DESCRIPTION = "This package provides debug information for package mingw32-binutils. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.45.1"

RPM_NAME = "mingw32-binutils-debug-2.45.1-3.4.noarch.rpm"
RPM_HASH = "10b3b8cde1cc2a59e3328058487b1889a576738ea1bd03ff59e380c1f6089b3ecdca9cd54c9df6401188adbe6df9f09227e2d31f85bfd5288b8bdc4ab74134b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-binutils-debug"

RDEPENDS:${PN} += ""

inherit rpm
