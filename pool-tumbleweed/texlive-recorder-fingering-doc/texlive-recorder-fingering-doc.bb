SUMMARY = "Documentation for texlive-recorder-fingering"
DESCRIPTION = "This package includes the documentation for texlive-recorder-fingering"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76924"

RPM_NAME = "texlive-recorder-fingering-doc-2026.226.1.5svn76924-60.4.noarch.rpm"
RPM_HASH = "2046688eb839dce06bc7a0b7826915e6299b962730ca988089613d46a9c53439429b516e79002c230b09d60b7bbebd40f30e230da4ca87b77d4031979cb18da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recorder-fingering-doc"

RDEPENDS:${PN} += ""

inherit rpm
