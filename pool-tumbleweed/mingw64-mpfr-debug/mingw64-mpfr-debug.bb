SUMMARY = "Debug information for package mingw64-mpfr"
DESCRIPTION = "This package provides debug information for package mingw64-mpfr. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "mingw64-mpfr-debug-3.1.4-3.1.noarch.rpm"
RPM_HASH = "51691a10e438cc965072ee590edef3b8372c4e7b5092872b1db042c648c67f37e897a31b15170132d73fee35cc88295caa6501cd90eac9ea0a36d67416d00d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-mpfr-debug"

RDEPENDS:${PN} += ""

inherit rpm
