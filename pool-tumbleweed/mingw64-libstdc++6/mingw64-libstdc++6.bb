SUMMARY = "MinGW Windows compiler for C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-libstdc++6-16.2.0-1.1.noarch.rpm"
RPM_HASH = "2cdb374b250c3458e8a20b0df4f65a4ea3daf72191f861bee149ed3ca85d2c5a65c7bc4ebf5a03033853bf62237270dea79eb130be335d1c9e703718a2379bfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libstdc++ \
mingw64-libstdc++-6.dll \
mingw64-libstdc++6"

RDEPENDS:${PN} += "mingw64-libgcc-s-seh-1.dll \
mingw64-libwinpthread-1.dll"

inherit rpm
