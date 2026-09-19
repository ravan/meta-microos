SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-libclang13-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "af3460038b2cdabe154f327cd1d8aa00bf1d1f1fca8df10443f022e5a08bc3992bb2d703f5b6b085b0e378860207305241e7b189b37bb40b1fa5b8c3967994fc"

RPROVIDES:${PN} += "libclang.so.13 \
libclang13 \
llvm22-libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libc.so.6 \
libclang-cpp.so.22.1 \
libstdc++.so.6"

inherit rpm
