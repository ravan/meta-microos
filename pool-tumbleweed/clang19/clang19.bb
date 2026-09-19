SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "clang19-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "2cd9881c605862e48a42982a89fc2f303b25236c98faff84724e3c1ecb4821a199dd647658120763606586124b914b18c131e7cd552a789c512c1e246bf706ea"

RPROVIDES:${PN} += "clang19 \
clang19-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.19.1 \
libLLVMTableGen.so.19.1 \
libc.so.6 \
libclang-cpp.so.19.1 \
libclang-rt19 \
libclang.so.13 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
