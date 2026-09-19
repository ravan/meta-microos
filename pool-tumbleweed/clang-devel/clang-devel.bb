SUMMARY = "CLANG frontend for LLVM (devel package)"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
(development files) \
 \
This package is a dummy package that depends on the version of \
clang-devel that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "clang-devel-23-1.1.aarch64.rpm"
RPM_HASH = "7e1a0780e08f487b5a7718b9cd5b4090a839a710fb16150c4bbc992b3f5ad8c32c84458572e4bacc0e0d6f2f8bc0c336cb6de0a9ecb97f653b5d649352ce2e27"

RPROVIDES:${PN} += "clang-devel \
clang-devel-static \
llvm-clang-devel"

RDEPENDS:${PN} += "clang \
clang23-devel \
llvm-devel"

inherit rpm
