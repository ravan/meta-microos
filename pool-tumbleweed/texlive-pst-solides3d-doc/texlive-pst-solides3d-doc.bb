SUMMARY = "Documentation for texlive-pst-solides3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-solides3d"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.35asvn68786"

RPM_NAME = "texlive-pst-solides3d-doc-2026.226.4.35asvn68786-60.4.noarch.rpm"
RPM_HASH = "7d9b243de56c24d6cb2c4902fabd32b5464357dd21790e56198562c12b1b2f2fc6151d1b77fc29af1be51912e795df8784f9cfddf67c9a04d2569afd3bc0881d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-solides3d-doc-en \
texlive-pst-solides3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
