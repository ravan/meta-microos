SUMMARY = "Documentation for texlive-dbshow"
DESCRIPTION = "This package includes the documentation for texlive-dbshow"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76924"

RPM_NAME = "texlive-dbshow-doc-2026.226.1.5svn76924-59.2.noarch.rpm"
RPM_HASH = "7431644a411866a2c6d58f8098e0ba26d3c6cdc841dce662b5780a5a3ba3b9dee4abf1f4a8e8b777483df781bcf782026569517202939b8aa0691895fc82c45c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-dbshow-doc-zh \
texlive-dbshow-doc"

RDEPENDS:${PN} += ""

inherit rpm
