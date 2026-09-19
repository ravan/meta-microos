SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "clang23-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "ab8b7f68298323d2406b1685c61c7d41d95c4268f674d455dd97183b00c11338a3af1ce632e362ece6497e8d87ad5fd9cf5e7b1f4abbf249087abd0346fb45d3"

RPROVIDES:${PN} += "clang23"

RDEPENDS:${PN} += "gcc \
glibc-devel \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libLLVMTableGen.so.23.1 \
libc.so.6 \
libclang-cpp.so.23.1 \
libclang-rt23 \
libclang.so.13 \
libm.so.6 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
