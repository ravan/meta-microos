SUMMARY = "Documentation for texlive-nodetree"
DESCRIPTION = "This package includes the documentation for texlive-nodetree"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4.1svn76924"

RPM_NAME = "texlive-nodetree-doc-2026.226.2.4.1svn76924-61.2.noarch.rpm"
RPM_HASH = "71a18db83da16c3f40f835b781c5d379cc2849ea5808537f4ff97a479ba9b646a21b265058cff1bffc5c4ba7de05a061a6446f4d56eb16da486efba937eb431f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nodetree-doc"

RDEPENDS:${PN} += ""

inherit rpm
