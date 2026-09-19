SUMMARY = "Clang stable C API for indexing and code completion"
DESCRIPTION = "This library exposes a limited C API for indexing and code completion for \
code written in languages of the C family. \
It is designed to be stable across major versions of LLVM. \
 \
It corresponds to the header files in /usr/include/clang-c."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-libclang13-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "0349afd3719c2a1dbf356a4e9bfa89b49d323ac0b2a2e67736e7cdc00c96f598bb25007a29a8d826c493befd68047a1ff8073d98880458af9df1d1238abdaa8b"

RPROVIDES:${PN} += "libclang.so.13 \
libclang13 \
llvm18-libclang13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.18.1 \
libc.so.6 \
libclang-cpp.so.18.1 \
libstdc++.so.6"

inherit rpm
