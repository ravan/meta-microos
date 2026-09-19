SUMMARY = "Documentation for texlive-polyglossia"
DESCRIPTION = "This package includes the documentation for texlive-polyglossia"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn76990"

RPM_NAME = "texlive-polyglossia-doc-2026.226.2.9svn76990-59.2.noarch.rpm"
RPM_HASH = "8bf17b53169e7ff1325b8fba0fb7d234504f87790d84574c2daf750497d08e3c9dbf25395b492bebc2c8060b30a9ee6256a59dea4b6b6417f371442fd37b57d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polyglossia-doc"

RDEPENDS:${PN} += ""

inherit rpm
