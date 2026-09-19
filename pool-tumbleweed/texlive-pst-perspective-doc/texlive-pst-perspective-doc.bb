SUMMARY = "Documentation for texlive-pst-perspective"
DESCRIPTION = "This package includes the documentation for texlive-pst-perspective"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn39585"

RPM_NAME = "texlive-pst-perspective-doc-2026.226.1.05svn39585-60.4.noarch.rpm"
RPM_HASH = "708dfb174a665e08ed6d785819df31a561c4bb11d726dfd681603544f60ad895142a5a3b609ac8731befc76323714b751400120f214a18c8507d7ef627ecd8b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-perspective-doc-de;en \
texlive-pst-perspective-doc"

RDEPENDS:${PN} += ""

inherit rpm
