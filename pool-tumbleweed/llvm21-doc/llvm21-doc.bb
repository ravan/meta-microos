SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-doc-21.1.8-9.2.noarch.rpm"
RPM_HASH = "822aa5bb94d9a4e0fcf541e422d7e35a1b9132daf38143176f9fd32b337226fdecadce46bc60c15288f09c931ad8c8b0222404d30d620ded777ea0889c052e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm21-doc"

RDEPENDS:${PN} += "llvm21"

inherit rpm
