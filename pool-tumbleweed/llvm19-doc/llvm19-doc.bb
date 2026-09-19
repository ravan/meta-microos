SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-doc-19.1.7-14.3.noarch.rpm"
RPM_HASH = "88dd422e73fbeef19f55b5cf2478af61bb486f8aa19bc2dae57deb9776b60702c2a5c5330109f24ce4f6153f1df86d2e3bd5ec6ab6acab822fc18d3acd388738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm19-doc"

RDEPENDS:${PN} += "llvm19"

inherit rpm
