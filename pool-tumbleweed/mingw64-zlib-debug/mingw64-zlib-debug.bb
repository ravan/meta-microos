SUMMARY = "Debug information for package mingw64-zlib"
DESCRIPTION = "This package provides debug information for package mingw64-zlib. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "Zlib"

PV = "1.3.2"

RPM_NAME = "mingw64-zlib-debug-1.3.2-1.6.noarch.rpm"
RPM_HASH = "ca344f2115a97ebe3404d9f67a0488de8c151bae222e0a22ed2924104887b8f0cccdd00ac75bbc6c38f87f866ccfab0bc01e4b8efefa36c3165c28c5d03644d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-zlib-debug"

RDEPENDS:${PN} += ""

inherit rpm
