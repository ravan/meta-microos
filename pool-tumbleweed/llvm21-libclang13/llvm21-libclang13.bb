SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-libclang13-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "b834d8fbb7ef72f54f5e898d25823bd2e04b4297689b4dd626e5bf05bfaf49c4631606452638bc8d05776f0dafa3bcd7a825ce47ec11d9c6c8fa0bdcc096cd7b"

RPROVIDES:${PN} += "libclang.so.13 \
libclang13 \
llvm21-libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libc.so.6 \
libclang-cpp.so.21.1 \
libstdc++.so.6"

inherit rpm
