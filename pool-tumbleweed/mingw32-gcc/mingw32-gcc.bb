SUMMARY = "MinGW Windows compiler (GCC) for C"
DESCRIPTION = "MinGW Windows compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-gcc-16.2.0-1.1.noarch.rpm"
RPM_HASH = "8cc71944796630b4df87a8f53c6b441015705a0667b6d216cdbf3c5f6c6462e4cd25aba063260bb90394d3febbaf676831ef85f7fb7e143f2f44d5bd5591254f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-gcc \
mingw32-lib-atomic \
mingw32-lib-atomic-asneeded \
mingw32-lib-caf-shmem \
mingw32-lib-caf-single \
mingw32-lib-gcc \
mingw32-lib-gcc-eh \
mingw32-lib-gcc-s \
mingw32-lib-gcov \
mingw32-lib-gomp \
mingw32-lib-ssp \
mingw32-lib-ssp-nonshared \
mingw32-liblto-plugin.dll"

RDEPENDS:${PN} += "/usr/bin/sh \
mingw32-binutils \
mingw32-cpp \
mingw32-headers \
mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll \
mingw32-runtime \
mingw32-winpthreads-devel"

inherit rpm
