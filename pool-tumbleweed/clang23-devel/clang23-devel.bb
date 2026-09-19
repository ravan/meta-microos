SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "clang23-devel-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "2d4d5bdf2ade4cfd63773f7a353bcb458517307a1bde2b3ef4c69557c8289d7c3488772a739e7fdfa9c840614fb2203d0e6b81154b9760fa8ef823be9b5ec7d3"

RPROVIDES:${PN} += "clang23-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang23 \
libclang-cpp23 \
libclang13 \
llvm23-devel"

inherit rpm
