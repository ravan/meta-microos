SUMMARY = "Documentation for texlive-aeskwadraat"
DESCRIPTION = "This package includes the documentation for texlive-aeskwadraat"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0.1svn75506"

RPM_NAME = "texlive-aeskwadraat-doc-2026.226.1.0.1svn75506-61.2.noarch.rpm"
RPM_HASH = "4f3bb3b8b55bfda67d8517f5401b4da523f8940a7b7b4f21545696e4ee67db860ec09e539b8988a7e14a1220edeca1d58432ffb88361e1842bbe5e2d55cffc4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aeskwadraat-doc"

RDEPENDS:${PN} += ""

inherit rpm
