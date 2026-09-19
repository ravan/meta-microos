SUMMARY = "Documentation for texlive-mathastext"
DESCRIPTION = "This package includes the documentation for texlive-mathastext"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4esvn77682"

RPM_NAME = "texlive-mathastext-doc-2026.226.1.4esvn77682-59.2.noarch.rpm"
RPM_HASH = "d73ed759e685446bd14aeade30b678fb05ce1a909344f8fc16c5cca941478db0e68928e56bac2ed6d8c1561d922748b0dce3a8cb66a6358157aab9c9c39774e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathastext-doc"

RDEPENDS:${PN} += ""

inherit rpm
