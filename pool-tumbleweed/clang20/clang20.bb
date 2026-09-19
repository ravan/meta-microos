SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "clang20-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "effef3a516c954a21b21ecba24a403ed8e25f92543216b4fba3e5542abe4299fa8cad705ada372c1759b82a3197bb19ff55081f4e4087758df703c7e29359ddb"

RPROVIDES:${PN} += "clang20 \
clang20-update-alternatives-removed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libLLVM.so.20.1 \
libLLVMTableGen.so.20.1 \
libc.so.6 \
libclang-cpp.so.20.1 \
libclang-rt20 \
libclang.so.13 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
