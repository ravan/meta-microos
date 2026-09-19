SUMMARY = "Documentation for texlive-notes"
DESCRIPTION = "This package includes the documentation for texlive-notes"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn42428"

RPM_NAME = "texlive-notes-doc-2026.226.1.0.1svn42428-61.2.noarch.rpm"
RPM_HASH = "cec54d864b79439c8d3ade172fa4785e844cd2ef4ce32e92f94eb4ec30a4363e3cbfd1a49dc1488af3df4d304b44585824042af21b5c92d70d933ab84eb95872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notes-doc"

RDEPENDS:${PN} += ""

inherit rpm
