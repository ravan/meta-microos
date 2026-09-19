SUMMARY = "Documentation for texlive-numericplots"
DESCRIPTION = "This package includes the documentation for texlive-numericplots"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0.2svn31729"

RPM_NAME = "texlive-numericplots-doc-2026.226.2.0.2svn31729-61.2.noarch.rpm"
RPM_HASH = "a5c26885656b3d09ab9b0f7fa3370e04541a3d7125c30810dbf20d86ed85b0234b99a10d3c68ce5ce0fdc46009fb612afa3f352fb05ed28d2cca0f3c05855c33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numericplots-doc"

RDEPENDS:${PN} += ""

inherit rpm
