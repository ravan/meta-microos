SUMMARY = "MinGW Windows compiler for Fortran"
DESCRIPTION = "MinGW Windows compiler for Fortran"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-gcc-fortran-16.2.0-1.1.noarch.rpm"
RPM_HASH = "bf289a1793032b7d22674a3ab6420b6501c10601bc01d88927e0054d2c086c9cc1ca0544952abaef2b8c6c2453724e2148170ff03e501604754eb7c7a8adfd35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gcc-fortran \
mingw32-lib-gfortran \
mingw32-lib-quadmath"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll"

inherit rpm
