SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "clang22-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "edb0485d82e56926b133aaf651c8067ca4a5dac604fdc4fabd055d938cddd3d9d099a869bbe7905370ced4612a753c080209806fd1dfef19ce96ebfa55703be7"

RPROVIDES:${PN} += "clang22 \
clang22-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc \
glibc-devel \
ld-linux-aarch64.so.1 \
libLLVM.so.22.1 \
libLLVMTableGen.so.22.1 \
libc.so.6 \
libclang-cpp.so.22.1 \
libclang-rt22 \
libclang.so.13 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
