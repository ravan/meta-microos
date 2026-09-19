SUMMARY = "MinGW Windows compiler for Fortran shared libraries"
DESCRIPTION = "MinGW Windows compiler for Fortran shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-libgfortran5-16.2.0-1.1.noarch.rpm"
RPM_HASH = "11b7cfd97845723f29be7407106f11205ce1cfb1fe4d6061b49a0326758292e3a5e4a261b0244bdea40d16b9f0f538dc140678c153da31b9479d3707aa180613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libgfortran \
mingw32-libgfortran-5.dll \
mingw32-libgfortran5"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libquadmath-0.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
