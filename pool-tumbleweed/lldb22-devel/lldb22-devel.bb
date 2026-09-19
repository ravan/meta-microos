SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "lldb22-devel-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "9a90cf286d47d86327fc559bc9745cb1e750ad230568d0961e529b198b1ac35bfacfe5133a306a46759b6c32de3ead12dfa9e82bfb8b57efe0c45a1e5a517dc4"

RPROVIDES:${PN} += "lldb-devel-provider \
lldb22-devel"

RDEPENDS:${PN} += "clang22-devel \
liblldb22 \
llvm22-devel \
pkgconfig-libedit \
pkgconfig-libxml-2.0"

inherit rpm
