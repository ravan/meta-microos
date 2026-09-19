SUMMARY = "Documentation for texlive-everypage"
DESCRIPTION = "This package includes the documentation for texlive-everypage"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn77682"

RPM_NAME = "texlive-everypage-doc-2026.226.2.0bsvn77682-59.2.noarch.rpm"
RPM_HASH = "0b378aa1385c27196ff1d3f2fcb1fa63a46057b49e529e1f0b24aea98ab75c39d27e6e643dcd9305a4e216411256571ce4cbca1de402c5975dd9c2e13b68ca3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everypage-doc"

RDEPENDS:${PN} += ""

inherit rpm
