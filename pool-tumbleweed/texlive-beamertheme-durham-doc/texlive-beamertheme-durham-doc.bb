SUMMARY = "Documentation for texlive-beamertheme-durham"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-durham"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn78101"

RPM_NAME = "texlive-beamertheme-durham-doc-2026.226.1.1.0svn78101-61.2.noarch.rpm"
RPM_HASH = "7c2718cd4562f71ecabc999f09cd6b3d0ba20d28170e6bbfed2fd25b06b5946b4e9cdb67ed08ec5b0c3a79252e80786cd770f43c1464f5af90742e11dc3437f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-durham-doc"

RDEPENDS:${PN} += ""

inherit rpm
