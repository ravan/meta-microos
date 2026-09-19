SUMMARY = "Debug information for package mingw64-mpc"
DESCRIPTION = "This package provides debug information for package mingw64-mpc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "mingw64-mpc-debug-1.0.2-3.9.noarch.rpm"
RPM_HASH = "6247baa1a0f0cd0cb67eea5943d0989b6469170b3872a08186d518d741c3edd028ca3e089a0cc22dbfc78096a018c312263883283fd610fc4ae295fe33c987e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-mpc-debug"

RDEPENDS:${PN} += ""

inherit rpm
