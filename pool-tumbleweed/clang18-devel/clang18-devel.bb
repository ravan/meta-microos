SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "clang18-devel-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "8fead898ad4960ccc001aa965a947be267c70ac89d264887fe6e9776f415e025dc487c1875e24439761d76b472114b5b5290413806a881ab5e0b5aadf026f87f"

RPROVIDES:${PN} += "clang18-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang18 \
libclang-cpp18 \
libclang13 \
llvm18-devel"

inherit rpm
