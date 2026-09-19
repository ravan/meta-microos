SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-doc-20.1.8-8.2.noarch.rpm"
RPM_HASH = "d2984c125f0a14795eadeb2e091585866825cddf3f0d9e2b05c6e2d5f71e703d4b33d4fcc5e3b183d2e2a16afb10c455ec507a63ff9ad230aed6d517778c95f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm20-doc"

RDEPENDS:${PN} += "llvm20"

inherit rpm
