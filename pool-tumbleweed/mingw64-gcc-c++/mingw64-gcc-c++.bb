SUMMARY = "MinGW Windows compiler for C++"
DESCRIPTION = "MinGW Windows compiler for C++"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-gcc-c++-16.2.0-1.1.noarch.rpm"
RPM_HASH = "ef879f6bd8f08562cda52fe03040f38652d8a7db12bc375a57c30155e6aa9766a5dce58bd32fb3f3984554092db01ff3c81c92e69fad8784df5bf962715a8128"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gcc-c++ \
mingw64-lib-stdc++ \
mingw64-lib-stdc++exp \
mingw64-lib-stdc++fs \
mingw64-lib-supc++"

RDEPENDS:${PN} += "mingw64-libgmp-10.dll \
mingw64-libmpc-3.dll \
mingw64-libmpfr-4.dll \
mingw64-libstdc++-gdb-printer \
mingw64-libwinpthread-1.dll \
mingw64-libz.dll"

inherit rpm
