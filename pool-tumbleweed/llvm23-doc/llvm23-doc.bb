SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "llvm23-doc-23.1.1-1.1.noarch.rpm"
RPM_HASH = "1e2917dc98a8e847e57b2e15fa41e263ec629a93789c9a4a2b6f79dbe7e9b6bf0c84291fefea14cd681de15420d35c3c7ebd743e69d9aa0e27cd793d5c650dcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm23-doc"

RDEPENDS:${PN} += "llvm23"

inherit rpm
