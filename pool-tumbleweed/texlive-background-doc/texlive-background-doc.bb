SUMMARY = "Documentation for texlive-background"
DESCRIPTION = "This package includes the documentation for texlive-background"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn42428"

RPM_NAME = "texlive-background-doc-2026.226.2.1svn42428-60.2.noarch.rpm"
RPM_HASH = "c04b6239f637444d9231b10084c92e33a3c5f925ad998ef2d53b4c56a8c21b53beb8d33bd49b73073d53a15384ef55c8c5072b563a29e922d305a068844bbe6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-background-doc"

RDEPENDS:${PN} += ""

inherit rpm
