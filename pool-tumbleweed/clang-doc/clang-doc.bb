SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler. \
 \
This package is a dummy package that depends on the version of \
clang-doc that openSUSE currently supports.  Packages that \
don't require a specific Clang version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "clang-doc-23-1.1.aarch64.rpm"
RPM_HASH = "7a3ff66d4569866b33c9c78b33f169009b76d65d88235d3fd1c4897bc1199a4304e50b2ab2f82c87cfeb60abcd8d510b2e65978a6838ce5f394be6f2eebf2766"

RPROVIDES:${PN} += "clang-doc"

RDEPENDS:${PN} += "clang \
clang23-doc"

inherit rpm
