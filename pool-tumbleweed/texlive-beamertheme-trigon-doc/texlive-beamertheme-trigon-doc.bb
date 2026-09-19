SUMMARY = "Documentation for texlive-beamertheme-trigon"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-trigon"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.0svn65985"

RPM_NAME = "texlive-beamertheme-trigon-doc-2026.226.0.0.7.0svn65985-61.2.noarch.rpm"
RPM_HASH = "703c29bea01f75252f1a5d97a29138c592c743c6dcc9754bbf5849486f75daefe073645de2e32f96ee81fd07e2d8558b1cedd04cd71af15763a88a29ad2b50ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-trigon-doc"

RDEPENDS:${PN} += ""

inherit rpm
