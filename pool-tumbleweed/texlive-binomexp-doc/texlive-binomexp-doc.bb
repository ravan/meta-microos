SUMMARY = "Documentation for texlive-binomexp"
DESCRIPTION = "This package includes the documentation for texlive-binomexp"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-binomexp-doc-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "ea701f673e611c47ebe472dc22507090b0e95f3a92ab9b3e0dc0afca15157d3caaca2b1c438c74ef2013585c872699b217de28f3b4354f62cb525cac7d431969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-binomexp-doc"

RDEPENDS:${PN} += ""

inherit rpm
