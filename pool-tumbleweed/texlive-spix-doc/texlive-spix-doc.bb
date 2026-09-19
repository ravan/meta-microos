SUMMARY = "Documentation for texlive-spix"
DESCRIPTION = "This package includes the documentation for texlive-spix"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3.0svn65050"

RPM_NAME = "texlive-spix-doc-2026.226.1.3.0svn65050-64.2.noarch.rpm"
RPM_HASH = "93681d384c8c1ce7e416c3f7c481fce3d45de839c7aa753fef3e8f7d072b607c4176843afcc95106130c07887f33f508f1b80d484f25b85ce9d065ef1dd3df20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-spix.1 \
texlive-spix-doc"

RDEPENDS:${PN} += ""

inherit rpm
