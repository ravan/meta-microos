SUMMARY = "MinGW Windows compiler for Objective-C and Objective-C++"
DESCRIPTION = "MinGW Windows compiler for Objective-C and Objective-C++"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-gcc-objc-16.2.0-1.1.noarch.rpm"
RPM_HASH = "baeb7575945ef5329937208aa7938e01e30b5b5eeb594800c4a25ce3ecba5d78827f5d09d4e730685fb48907c940cfcdd0a60ecd54ffd090f5a38e693a546ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gcc-objc \
mingw32-lib-objc"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll"

inherit rpm
