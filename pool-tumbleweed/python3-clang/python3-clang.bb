SUMMARY = "Python bindings for libclang"
DESCRIPTION = "This package contains the Python bindings to clang (C language) \
frontend for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "python3-clang-23-1.1.noarch.rpm"
RPM_HASH = "9169ce629b3aaf1b3a3d0280a2a2f3733b831e7b73bf1b6fb5092a2a71804f2f00420837a7dbd6ac61d60d3a36548a1d17d257199db27af0501b053298814d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clang"

RDEPENDS:${PN} += "python3-clang23"

inherit rpm
