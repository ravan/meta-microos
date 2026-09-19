SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "clang20-devel-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "52aef3a7a3f07fb20a093670348cd3009cf2fc26139c8ae8e09284822bcea24e8746e3192b14f4678149f5f0be6bd0f8953e4306927d9b9d19f304e7b018f208"

RPROVIDES:${PN} += "clang20-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang20 \
libclang-cpp20 \
libclang13 \
llvm20-devel"

inherit rpm
