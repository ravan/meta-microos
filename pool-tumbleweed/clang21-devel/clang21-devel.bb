SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "clang21-devel-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "89b33544eaad0a75ae916c7ba05812f485453aefcdb724a479592e248b6b7cd85afafd017e09ea0ee144dc0230c1269a91753efa8a2920a3c1ab8b033dee97d6"

RPROVIDES:${PN} += "clang21-devel \
cmake-Clang"

RDEPENDS:${PN} += "/sbin/ldconfig \
clang-tools \
clang21 \
libclang-cpp21 \
libclang13 \
llvm21-devel"

inherit rpm
