SUMMARY = "MinGW Windows compiler (GCC) for C"
DESCRIPTION = "MinGW Windows compiler (GCC) for C"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-gcc-16.2.0-1.1.noarch.rpm"
RPM_HASH = "615e34c09587f6fac5589eaabfa2d28b06555756ae386ba82be18bf16bef5d4ce69412bb980ede464cdfd91ad71654c0318caafcc8146952244ed839a993c5f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-gcc \
mingw64-lib-atomic \
mingw64-lib-atomic-asneeded \
mingw64-lib-caf-shmem \
mingw64-lib-caf-single \
mingw64-lib-gcc \
mingw64-lib-gcc-eh \
mingw64-lib-gcc-s \
mingw64-lib-gcov \
mingw64-lib-gomp \
mingw64-lib-ssp \
mingw64-lib-ssp-nonshared \
mingw64-liblto-plugin.dll"

RDEPENDS:${PN} += "/usr/bin/sh \
mingw64-binutils \
mingw64-cpp \
mingw64-headers \
mingw64-libgmp-10.dll \
mingw64-libmpc-3.dll \
mingw64-libmpfr-4.dll \
mingw64-libwinpthread-1.dll \
mingw64-libz.dll \
mingw64-runtime \
mingw64-winpthreads-devel"

inherit rpm
