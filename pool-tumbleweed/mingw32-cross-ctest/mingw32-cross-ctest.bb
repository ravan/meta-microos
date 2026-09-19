SUMMARY = "CTest support for cross CMake package"
DESCRIPTION = "This package provides the required package to running tests \
with cross compiled binaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.6"

RPM_NAME = "mingw32-cross-ctest-1.1.6-1.4.noarch.rpm"
RPM_HASH = "9dcfafe15ef33cbca04ed5a6c1075427aa31ed4e48f0bfd486a255ab37a07dffd9afe4a94b285a259c7f582230331789d237f5d52383b3400a49bf0dc46fa445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cross-ctest"

RDEPENDS:${PN} += "mingw32-cross-cmake \
mingw32-cross-wine"

inherit rpm
