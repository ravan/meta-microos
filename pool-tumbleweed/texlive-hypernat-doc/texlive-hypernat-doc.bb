SUMMARY = "Documentation for texlive-hypernat"
DESCRIPTION = "This package includes the documentation for texlive-hypernat"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0bsvn17358"

RPM_NAME = "texlive-hypernat-doc-2026.226.1.0bsvn17358-60.2.noarch.rpm"
RPM_HASH = "e04fac27ebb23620d933aa87775cd88011b335cac9fa44d51b253e4f073490cb879d2706f4d9cdee98d487339ff9a9be85172cb441eed2e9265aea11d154daac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypernat-doc"

RDEPENDS:${PN} += ""

inherit rpm
