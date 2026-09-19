SUMMARY = "Documentation for texlive-footnpag"
DESCRIPTION = "This package includes the documentation for texlive-footnpag"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-footnpag-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "f2287f2cf79deddc6fe976cdee1014d713d6c950a040b3208293f4a7b2dfffdf2b1dcb51531d448bd16e65d00b5cc0a28d103d5925cf18b5c758e05a49b31c5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnpag-doc"

RDEPENDS:${PN} += ""

inherit rpm
