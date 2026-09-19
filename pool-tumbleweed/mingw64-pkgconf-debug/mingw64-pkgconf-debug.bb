SUMMARY = "Debug information for package mingw64-pkgconf"
DESCRIPTION = "This package provides debug information for package mingw64-pkgconf. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw64-pkgconf-debug-1.6.3-5.9.noarch.rpm"
RPM_HASH = "ea7c9b98ccd7833dc6435b31a4b3ea40fd20ade62acd5a85def4c03beaec201ae7430281970f112c04ba96d7c56528ea7d04632ab0c786bdd1e979dcd722e488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-pkgconf-debug"

RDEPENDS:${PN} += ""

inherit rpm
