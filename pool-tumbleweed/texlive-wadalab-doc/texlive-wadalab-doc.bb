SUMMARY = "Documentation for texlive-wadalab"
DESCRIPTION = "This package includes the documentation for texlive-wadalab"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42428"

RPM_NAME = "texlive-wadalab-doc-2026.226.svn42428-60.2.noarch.rpm"
RPM_HASH = "3cdc3465e6b9b59e1997e42c3eb24d97b27028f57805a9933630d777458172a9e147bd168d2a0882a1528ce6e8f82e8fefa93aaa58c92e96d6b878232947cd1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wadalab-doc"

RDEPENDS:${PN} += ""

inherit rpm
