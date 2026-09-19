SUMMARY = "Documentation for texlive-probsoln"
DESCRIPTION = "This package includes the documentation for texlive-probsoln"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.05svn44783"

RPM_NAME = "texlive-probsoln-doc-2026.226.3.05svn44783-59.2.noarch.rpm"
RPM_HASH = "227710f4ef4bf1875c266461b43ecabbf67c3d9332b7596a57c93086dc140b4b47e77a08883e01255341f283224e52c4280070c7679982b3751eeb141866ecb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-probsoln-doc"

RDEPENDS:${PN} += ""

inherit rpm
