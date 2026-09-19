SUMMARY = "MinGW Windows compiler for Fortran shared libraries"
DESCRIPTION = "MinGW Windows compiler for Fortran shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-libgfortran5-16.2.0-1.1.noarch.rpm"
RPM_HASH = "000ba6f58448d0cc11277e84c856cb15119a5492bdfdee092fbef290f951365a4bbdec23e326e0a1a725032d1e328f5e9e3bbdf8ffb256f50b3a6cb87bceff4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libgfortran \
mingw64-libgfortran-5.dll \
mingw64-libgfortran5"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libquadmath-0.dll \
mingw64-libwinpthread-1.dll"

inherit rpm
