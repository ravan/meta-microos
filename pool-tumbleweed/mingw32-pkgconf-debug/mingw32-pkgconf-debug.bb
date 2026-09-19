SUMMARY = "Debug information for package mingw32-pkgconf"
DESCRIPTION = "This package provides debug information for package mingw32-pkgconf. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "ISC"

PV = "1.6.3"

RPM_NAME = "mingw32-pkgconf-debug-1.6.3-5.9.noarch.rpm"
RPM_HASH = "93238a76397aa366a86c3bc6216178197c90f361c94d28d2112e394bcc51c2899a5f589a45f61c307afb84d9de6837f18dd435e2cd02d73b398ed421904b2d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-pkgconf-debug"

RDEPENDS:${PN} += ""

inherit rpm
