SUMMARY = "Documentation for texlive-docbytex"
DESCRIPTION = "This package includes the documentation for texlive-docbytex"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn34294"

RPM_NAME = "texlive-docbytex-doc-2026.226.svn34294-59.2.noarch.rpm"
RPM_HASH = "083a16f873eebe317b8402f1636c2d0472acad313fa2af3f94bad4d4a8cd5ebee2ca355ca964ab36e167f0039d4b229908e30d0ea44a0dccab743395a98bcf45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-docbytex-doc-cs \
texlive-docbytex-doc"

RDEPENDS:${PN} += ""

inherit rpm
