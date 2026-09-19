SUMMARY = "Debug information for package mingw32-gmp"
DESCRIPTION = "This package provides debug information for package mingw32-gmp. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw32-gmp-debug-6.1.1-4.1.noarch.rpm"
RPM_HASH = "0cd64de9dffc768525990c1e62eafa461fa171bba15db97afaf36535a7a464725303d7c00155772ebfb9a52f2b302ea534c7670bae2e1b7dc55d732aecc9ddea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gmp-debug"

RDEPENDS:${PN} += ""

inherit rpm
