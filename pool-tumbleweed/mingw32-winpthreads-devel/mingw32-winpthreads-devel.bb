SUMMARY = "Development files for mingw32-winpthreads"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "14.0.0"

RPM_NAME = "mingw32-winpthreads-devel-14.0.0-1.1.noarch.rpm"
RPM_HASH = "9313deeb8485f37fedf7012e2cfb666d3d427c6dd8bbee0861b03b1f8e9dd8b9fb513930d37b923e5915fdc4cf9d78719b23cd5a9ae786960e8c433a4cd985b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-lib-pthread \
mingw32-lib-winpthread \
mingw32-unistd-pthread-devel \
mingw32-winpthreads-devel"

RDEPENDS:${PN} += "mingw32-libwinpthread1"

inherit rpm
