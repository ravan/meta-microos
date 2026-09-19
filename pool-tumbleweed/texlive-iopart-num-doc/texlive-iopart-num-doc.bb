SUMMARY = "Documentation for texlive-iopart-num"
DESCRIPTION = "This package includes the documentation for texlive-iopart-num"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn15878"

RPM_NAME = "texlive-iopart-num-doc-2026.226.2.1svn15878-63.2.noarch.rpm"
RPM_HASH = "6a6f621e566bbecfd9d097e969d17073fa0fe11fb58a4ac2b3aa97c1ed4ea137069b683bc267dbb35845c14516f4f72177c85408e5984dce0f00f87a04049312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iopart-num-doc"

RDEPENDS:${PN} += ""

inherit rpm
