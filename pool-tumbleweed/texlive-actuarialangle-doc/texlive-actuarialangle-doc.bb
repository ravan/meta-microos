SUMMARY = "Documentation for texlive-actuarialangle"
DESCRIPTION = "This package includes the documentation for texlive-actuarialangle"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn67201"

RPM_NAME = "texlive-actuarialangle-doc-2026.226.2.1svn67201-61.2.noarch.rpm"
RPM_HASH = "b003e7c4e7f3a60d9c14d908db72a86b77d80c5a275ba537552cfcadb9e5272add654b28134a7d3eb1ee5e7b6c7b136ab9d54c5043db506453ec60abc00b1e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-actuarialangle-doc"

RDEPENDS:${PN} += ""

inherit rpm
