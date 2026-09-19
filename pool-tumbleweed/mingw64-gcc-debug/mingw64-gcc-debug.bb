SUMMARY = "Debug information for package mingw64-gcc"
DESCRIPTION = "This package provides debug information for package mingw64-gcc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-gcc-debug-16.2.0-1.1.noarch.rpm"
RPM_HASH = "a7c77d1c05826b30d5220a1a0cfa0c58f01889a41d32de4d4d96bc3d3898578cc0df95cd47fb1945c8b8fde51a302b932bc0c9ee0e43196e2759e538ed6fe18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gcc-debug"

RDEPENDS:${PN} += ""

inherit rpm
