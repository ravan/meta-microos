SUMMARY = "Documentation for texlive-gmverse"
DESCRIPTION = "This package includes the documentation for texlive-gmverse"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.73svn29803"

RPM_NAME = "texlive-gmverse-doc-2026.226.0.0.73svn29803-60.4.noarch.rpm"
RPM_HASH = "0d1fb67eeff7f01b952c29b0ab3a7d11a8b90f94261cee51d892d5ae95b5359d5db23fc7523c0c1c2306cb51a3fe3d76f63bd742edfa2d412a3122d5d09edc4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmverse-doc"

RDEPENDS:${PN} += ""

inherit rpm
