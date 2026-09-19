SUMMARY = "Documentation for texlive-nopageno"
DESCRIPTION = "This package includes the documentation for texlive-nopageno"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-nopageno-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "c8a2d2bb6ca0d22d4e08b7037f16429a1f76281c9fb848d60aa3e1c0487822cb9e0dcca3de9d09004a7e4c8cc2f401c84bafa574c5c2907b45f0b3595482b889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nopageno-doc"

RDEPENDS:${PN} += ""

inherit rpm
