SUMMARY = "MinGW Windows compiler for C++"
DESCRIPTION = "MinGW Windows compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-gcc-c++-16.2.0-1.1.noarch.rpm"
RPM_HASH = "7219b7207aba6d328e7013f6ce8b153b1e947ce5b3f90d9d55c2c19401cfec54b715ac8b144437656a6c730676f1b5e2effa54f482cc8a894397b3e7bf8b2d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gcc-c++ \
mingw32-lib-stdc++ \
mingw32-lib-stdc++exp \
mingw32-lib-stdc++fs \
mingw32-lib-supc++"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libstdc++-gdb-printer \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll"

inherit rpm
