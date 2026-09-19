SUMMARY = "Documentation for texlive-unamthesis"
DESCRIPTION = "This package includes the documentation for texlive-unamthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn43639"

RPM_NAME = "texlive-unamthesis-doc-2026.226.2.1svn43639-60.2.noarch.rpm"
RPM_HASH = "41ce1745e6dc160260003a4c5eae40c783ce1e920da065278dc24c216750e9cabead0c028bd3262246e95ba738eedd477b3cf0ada1fdc0821aff7e52cc0669ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unamthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
