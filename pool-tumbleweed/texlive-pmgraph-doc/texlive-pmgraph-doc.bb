SUMMARY = "Documentation for texlive-pmgraph"
DESCRIPTION = "This package includes the documentation for texlive-pmgraph"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-pmgraph-doc-2026.226.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "b349215cdb91a89456906266e4f1aac41abcb8f27d1d13ed48018bb4d5d8b48e0843a52884d349fb07d77a43cf8980dcdc83d0208b32fcb2435b308b65058751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pmgraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
