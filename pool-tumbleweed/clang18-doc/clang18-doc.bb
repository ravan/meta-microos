SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "clang18-doc-18.1.8-13.1.noarch.rpm"
RPM_HASH = "eb208a3b3dd47660c28f25ef288dcae67a0eb383845efa439d5f8a46f40eecd268b2af2a2e18ab836b62073eda81dc6d1969a9ce7978887a2ebc715e0d1a8c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang18-doc"

RDEPENDS:${PN} += ""

inherit rpm
