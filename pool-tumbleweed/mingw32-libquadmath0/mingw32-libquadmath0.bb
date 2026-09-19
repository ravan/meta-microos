SUMMARY = "MinGW Windows Fortran Compiler Quadmath Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran \
compiler of the GNU Compiler Collection (GCC) and quadruple precision \
floating point operations."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-libquadmath0-16.2.0-1.1.noarch.rpm"
RPM_HASH = "1d53f3fe929c71e9e4ff058c1a4be7a7616f598600c391e2d01d884a03013bbc5da12618a039dcc5ef8565e87a5f7f05c72896a876acf99dfe61a10dfb77a6ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libquadmath-0.dll \
mingw32-libquadmath0"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll"

inherit rpm
