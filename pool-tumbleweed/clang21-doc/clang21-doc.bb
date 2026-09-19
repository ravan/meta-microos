SUMMARY = "Documentation for Clang"
DESCRIPTION = "This package contains documentation for the Clang compiler."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "clang21-doc-21.1.8-9.2.noarch.rpm"
RPM_HASH = "79032d93ed5c5a4377e6c2a2ba5413ff1cc15525397072ae0e91b0ef5b59f820c4caccec0b01db4258317fc0eb90718127530e6181b1af1db7d265c9b3b02a4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clang-doc-provider \
clang21-doc"

RDEPENDS:${PN} += ""

inherit rpm
