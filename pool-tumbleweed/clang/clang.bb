SUMMARY = "CLANG frontend for LLVM"
DESCRIPTION = "This package contains the clang (C language) frontend for LLVM. \
 \
This package is a dummy package that depends on the version of \
clang that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "clang-23-1.1.aarch64.rpm"
RPM_HASH = "0a92f2a107f9951aa644285cd42b29be200c545f51bfcf5b75188a4b74a68465843d7fca7596029cdee4f475c5ef323797f8c9a70899178bf3a09e5a0a139d4c"

RPROVIDES:${PN} += "clang \
llvm-clang \
llvm-emacs-plugins"

RDEPENDS:${PN} += "clang23"

inherit rpm
