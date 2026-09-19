SUMMARY = "Debug information for package mingw32-gcc"
DESCRIPTION = "This package provides debug information for package mingw32-gcc. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-gcc-debug-16.2.0-1.1.noarch.rpm"
RPM_HASH = "a3209c9cfc8552c2000e1ab9e81d0d13beb0d35866f87b4e2bdff26561956dc276ec6c1cb681058eed121dcc631956d0589b26520b6ae0b0be0db60949aa3b87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gcc-debug"

RDEPENDS:${PN} += ""

inherit rpm
