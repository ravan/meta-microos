SUMMARY = "Documentation for texlive-beamertheme-upenn-bc"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-upenn-bc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn29937"

RPM_NAME = "texlive-beamertheme-upenn-bc-doc-2026.226.1.0svn29937-61.2.noarch.rpm"
RPM_HASH = "769a2845b21fc9b4ac94d22f99950ead0edbd37bd517f269039933ea955e7434a74bb1827604805442ebc5aeae7a42824a1dd8e9a90e38e8d827ecf1e2bc9f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-upenn-bc-doc"

RDEPENDS:${PN} += ""

inherit rpm
