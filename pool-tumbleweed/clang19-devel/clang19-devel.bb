SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "clang19-devel-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "d231f0d870da1bc52e79bead0f71791e6173d6caaceed1a2a711e3c8f61df35f40b3080f325a2bb657b8fc2cba7332a6547fcd2ffde4f402f6324f6440ded39b"

RPROVIDES:${PN} += "clang19-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang19 \
libclang-cpp19 \
libclang13 \
llvm19-devel"

inherit rpm
