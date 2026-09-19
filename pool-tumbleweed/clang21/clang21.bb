SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "clang21-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "6c707111bcb90836b1e4def1ad1cef94a96926e144eca82877191c25c799860c43e591d93246d495dcd69b4dd811da5998e6d980c01a558178ff3a6b932dbce0"

RPROVIDES:${PN} += "clang21 \
clang21-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc \
glibc-devel \
ld-linux-aarch64.so.1 \
libLLVM.so.21.1 \
libLLVMTableGen.so.21.1 \
libc.so.6 \
libclang-cpp.so.21.1 \
libclang-rt21 \
libclang.so.13 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
