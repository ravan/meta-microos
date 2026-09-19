SUMMARY = "Documentation for texlive-gmutils"
DESCRIPTION = "This package includes the documentation for texlive-gmutils"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.996svn24287"

RPM_NAME = "texlive-gmutils-doc-2026.226.0.0.996svn24287-60.4.noarch.rpm"
RPM_HASH = "3a4b3daa6a808c3a972efa2b743ac89e72530dee5805bcbdbe4a3e3b7f525d825b8da64025408f09ad38da88170e901f043fbb782ccf5daa56353e774a4261f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
