SUMMARY = "Debug information for package mingw32-winpthreads"
DESCRIPTION = "This package provides debug information for package mingw32-winpthreads. \
Debug information is useful when developing applications that use this \
package or when debugging this package."
LICENSE = "BSD-3-Clause & MIT"

PV = "14.0.0"

RPM_NAME = "mingw32-winpthreads-debug-14.0.0-1.1.noarch.rpm"
RPM_HASH = "ea6a042af2382333a2be30fde5fcfec2be200dfab3e1a28770f7792f504d97789a011a036f130e6fe6f8282a868ddc341f57784008738ca0040e8b6aba14c786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-winpthreads-debug"

RDEPENDS:${PN} += ""

inherit rpm
