SUMMARY = "Documentation for texlive-pst-circ"
DESCRIPTION = "This package includes the documentation for texlive-pst-circ"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.20svn72519"

RPM_NAME = "texlive-pst-circ-doc-2026.226.2.20svn72519-59.2.noarch.rpm"
RPM_HASH = "d8341d1a106733e74f2632cc15053da258c5eb7e865addaa9bf53c1fa2922df424b8752e272024637d4f04a8f0e8364ae869ed669a7153f1ad9073acc0897b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-circ-doc"

RDEPENDS:${PN} += ""

inherit rpm
