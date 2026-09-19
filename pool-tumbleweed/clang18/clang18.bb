SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "clang18-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "12d1bf37988419d2944d8ad6f18cde0745a4b1d99739e96c0deecbb83a64da6a9029d4a7b32bdf78fb3175e8e96df7c50e84524bb60527b15341152a3b44b02e"

RPROVIDES:${PN} += "clang18 \
clang18-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.18.1 \
libLLVMTableGen.so.18.1 \
libc.so.6 \
libclang-cpp.so.18.1 \
libclang-rt18 \
libclang.so.13 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
