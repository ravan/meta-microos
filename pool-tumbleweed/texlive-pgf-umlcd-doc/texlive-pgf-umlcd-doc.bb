SUMMARY = "Documentation for texlive-pgf-umlcd"
DESCRIPTION = "This package includes the documentation for texlive-pgf-umlcd"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn63386"

RPM_NAME = "texlive-pgf-umlcd-doc-2026.226.0.0.3svn63386-58.2.noarch.rpm"
RPM_HASH = "eeb4410eaebaeced66bad3ae8541468833e6cd73ae7a03201bd4d3e0a7c91432397f258a60245136b5ef316c89aef3ca9ed22d0f105206c07df68dee698eb56d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-umlcd-doc"

RDEPENDS:${PN} += ""

inherit rpm
