SUMMARY = "Documentation for texlive-zlmtt"
DESCRIPTION = "This package includes the documentation for texlive-zlmtt"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.032svn77682"

RPM_NAME = "texlive-zlmtt-doc-2026.226.1.032svn77682-59.4.noarch.rpm"
RPM_HASH = "c5c7afd4b5d82c2dbfe123308b10989290d817e04a698808ced07140e16920aad31350610574d415d2501e3c13dda24c83c2e65442242482ae981c4e34e9ec74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zlmtt-doc"

RDEPENDS:${PN} += ""

inherit rpm
