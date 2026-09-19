SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.1.6"

RPM_NAME = "mingw64-cross-cmake-1.1.6-1.4.noarch.rpm"
RPM_HASH = "6fc145fdd7abb0ff5b3313292d8a3c2669ea97cd184e2dcfe001c2a1aed11f222b73d05825a6ecb60fb8d64b2e93bdc1b9c85741048d834ea001964c960f3cfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-cmake \
rpm-lua-mingw64-cmake \
rpm-macro--mingw64-cmake \
rpm-macro--mingw64-cmake-build \
rpm-macro--mingw64-cmake-install \
rpm-macro--mingw64-ctest"

RDEPENDS:${PN} += "/usr/bin/python3 \
cmake \
mingw64-filesystem"

inherit rpm
