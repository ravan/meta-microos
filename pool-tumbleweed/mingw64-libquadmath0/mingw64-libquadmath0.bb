SUMMARY = "MinGW Windows Fortran Compiler Quadmath Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the Fortran \
compiler of the GNU Compiler Collection (GCC) and quadruple precision \
floating point operations."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-libquadmath0-16.2.0-1.1.noarch.rpm"
RPM_HASH = "53856e019771dc646335fc37c14cdd313c3fcb8ed3745b51a0df3b8525263cc685599ca200c24a78942c43de1d041b95fe25bd8d74152338ca95705876bd003f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libquadmath-0.dll \
mingw64-libquadmath0"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll"

inherit rpm
