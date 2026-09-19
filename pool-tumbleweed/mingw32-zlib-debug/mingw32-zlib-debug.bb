SUMMARY = "Debug information for package mingw32-zlib"
DESCRIPTION = "This package provides debug information for package mingw32-zlib. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw32-zlib-debug-1.3.2-1.6.noarch.rpm"
RPM_HASH = "456902469e442f77bd48d1f211848e708550e347e443b616a983124682fecb63286045b46d936de9933e0874e803bb9d11661df6cfe98fda5b7b3a15b16bd535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-zlib-debug"

RDEPENDS:${PN} += ""

inherit rpm
