SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-libobjc4-16.2.0-1.1.noarch.rpm"
RPM_HASH = "079f1d1036a0a1d6c30ee432416085e539ad2094390cac8b2d38a9dba0a6021b254fba8bdf78f14d835b2bd90f69098a82843adbe5eb9f3e3988149f858369f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libobjc \
mingw32-libobjc-4.dll \
mingw32-libobjc4"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
