SUMMARY = "Documentation for texlive-swimgraf"
DESCRIPTION = "This package includes the documentation for texlive-swimgraf"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25446"

RPM_NAME = "texlive-swimgraf-doc-2026.226.svn25446-64.2.noarch.rpm"
RPM_HASH = "deb131b7edfcde1d04b5a8a9b7b95ef1b26ec25409811ebac1609f88c618d13e879cac0e57507028c6e869b84b4e6f83a5dbc4bfea41e1902e6629db69a23fa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-swimgraf-doc"

RDEPENDS:${PN} += ""

inherit rpm
