SUMMARY = "Debug information for package mingw64-binutils"
DESCRIPTION = "This package provides debug information for package mingw64-binutils. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.45.1"

RPM_NAME = "mingw64-binutils-debug-2.45.1-3.4.noarch.rpm"
RPM_HASH = "519f4b5202eda5a24b588082bdc774917b89c0446cfe0583351982e5b0c7e25733c266a9a688332366134e7a011e9ee13b0f2953f4b84355acaf1b4aa7b4c215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-binutils-debug"

RDEPENDS:${PN} += ""

inherit rpm
