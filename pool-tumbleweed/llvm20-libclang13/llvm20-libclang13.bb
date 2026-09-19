SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-libclang13-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "0b10d99f65fb0c89f56b12160abd45284832ffdaed872411cdd770650eb312291233efef183783fff411bbfa598bf76141fbec9d32c5fc2bba9d72cf70342570"

RPROVIDES:${PN} += "libclang.so.13 \
libclang13 \
llvm20-libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.20.1 \
libc.so.6 \
libclang-cpp.so.20.1 \
libstdc++.so.6"

inherit rpm
