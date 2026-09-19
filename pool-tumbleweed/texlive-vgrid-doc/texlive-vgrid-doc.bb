SUMMARY = "Documentation for texlive-vgrid"
DESCRIPTION = "This package includes the documentation for texlive-vgrid"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn32457"

RPM_NAME = "texlive-vgrid-doc-2026.226.0.0.1svn32457-60.2.noarch.rpm"
RPM_HASH = "771e50b129c52026b1d6e4b29d2abacd90fe590b64b9e86ff37cdf2c70c042e2ec3e1802aa984e68d3217f7bb1a1b686f1b2c34f0eccccec3974baf06babeac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vgrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
