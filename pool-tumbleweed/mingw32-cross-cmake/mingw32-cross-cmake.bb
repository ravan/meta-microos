SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.1.6"

RPM_NAME = "mingw32-cross-cmake-1.1.6-1.4.noarch.rpm"
RPM_HASH = "f9ca01d27b49582014491b43faf05e3b0b9bf97a4141ef25f8c456a1f78d7c4f96ebb3ba37c119739b030ffa33c138477118cfd0f39b2ecbf2f52ec256af53df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cross-cmake \
rpm-lua-mingw32-cmake \
rpm-macro--mingw32-cmake \
rpm-macro--mingw32-cmake-build \
rpm-macro--mingw32-cmake-install \
rpm-macro--mingw32-ctest"

RDEPENDS:${PN} += "/usr/bin/python3 \
cmake \
mingw32-filesystem"

inherit rpm
