SUMMARY = "Documentation for texlive-pascaltriangle"
DESCRIPTION = "This package includes the documentation for texlive-pascaltriangle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-pascaltriangle-doc-2026.226.1.0.1svn76924-58.2.noarch.rpm"
RPM_HASH = "f064657a5afd45ae80d245a6fc7b2e670a617aa4c555295064b5920437136d0d4d59f494fd5f18a5175dbeffb75fb91900872db8c49feb1cdba1f973da04b963"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-pascaltriangle-doc-zh \
texlive-pascaltriangle-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
