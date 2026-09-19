SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-gcc-objc-16.2.0-1.1.noarch.rpm"
RPM_HASH = "da33935d21070db872396b143f5ffd57c2d20f39da9052bee9ae2c01c20d0aba0892266dfa2533fcf67e5acc0e906b65a76ab0ad450fbef254582cc36a07eaf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gcc-objc \
mingw64-lib-objc"

RDEPENDS:${PN} += "mingw64-libgmp-10.dll \
mingw64-libmpc-3.dll \
mingw64-libmpfr-4.dll \
mingw64-libwinpthread-1.dll \
mingw64-libz.dll"

inherit rpm
