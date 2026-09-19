SUMMARY = "Shlomi Fish's CMake Modules"
DESCRIPTION = "Shlomi Fish's CMake Modules"
LICENSE = "MIT"

PV = "8f5acb6450c1"

RPM_NAME = "shlomif-cmake-modules-8f5acb6450c1-1.18.noarch.rpm"
RPM_HASH = "1470acc2070eb3779e2d0870164f10d0c272d4028f6bd23fd6fc769b33f302f5fc9c051faef2e55467c4e4ae04c325c746887071055ef4cdcb69a1d63fc4a4ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "shlomif-cmake-modules"

RDEPENDS:${PN} += "cmake \
perl"

inherit rpm
