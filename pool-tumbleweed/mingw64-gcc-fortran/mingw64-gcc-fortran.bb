SUMMARY = "MinGW Windows compiler for Fortran"
DESCRIPTION = "MinGW Windows compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-gcc-fortran-16.2.0-1.1.noarch.rpm"
RPM_HASH = "3dd680fd2b10b16b1cbdc7ee98602f3f7ed398f234c97e1c32f3ab9b3ad911a5a9ce9f5189b0dcaac96d7c4b6b209abf999c324b044cdd353f9a8569bdbe3970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gcc-fortran \
mingw64-lib-gfortran \
mingw64-lib-quadmath"

RDEPENDS:${PN} += "mingw64-libgmp-10.dll \
mingw64-libmpc-3.dll \
mingw64-libmpfr-4.dll \
mingw64-libwinpthread-1.dll \
mingw64-libz.dll"

inherit rpm
