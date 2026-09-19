SUMMARY = "Documentation for texlive-utexasthesis"
DESCRIPTION = "This package includes the documentation for texlive-utexasthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn48648"

RPM_NAME = "texlive-utexasthesis-doc-2026.226.1.0svn48648-60.2.noarch.rpm"
RPM_HASH = "f28de27188ae6d5f623afb1888081b746db13eda69a6cee279a8fe60d51510556db414570d5060ad91840d12775f95f6017823a4f5cbd21390b1a90d9b165e8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utexasthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
