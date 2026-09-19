SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "clang22-devel-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "53c3dc7e15a2c3bb7c87d3d818532817bf6d0d91b4480e33267eeb0f2533d5f9b588ea651921dabe2c2e03c5337f636dbe0336415ca5837b404ad997bce5fb9b"

RPROVIDES:${PN} += "clang22-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang22 \
libclang-cpp22 \
libclang13 \
llvm22-devel"

inherit rpm
