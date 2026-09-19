SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.6"

RPM_NAME = "mingw64-cross-ctest-1.1.6-1.4.noarch.rpm"
RPM_HASH = "ae032a0eb973374b8e4beacae1500633d2cb8e005f6c26da5b7a4214b89fbd0039fdf3576c404cd3b95676828c153e97f194ca7fb4a5c24a18353a8ca20dd09b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-ctest"

RDEPENDS:${PN} += "mingw64-cross-cmake \
mingw64-cross-wine"

inherit rpm
