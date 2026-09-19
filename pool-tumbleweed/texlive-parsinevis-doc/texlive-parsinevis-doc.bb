SUMMARY = "Documentation for texlive-parsinevis"
DESCRIPTION = "This package includes the documentation for texlive-parsinevis"
LICENSE = "OFL-1.1"

PV = "2026.226.2.2svn70776"

RPM_NAME = "texlive-parsinevis-doc-2026.226.2.2svn70776-58.2.noarch.rpm"
RPM_HASH = "01fecb26052dea89ecb03b7d519275b05775490cc0948ea13dd856132b1b2f802ffdaa225d01935d5d104392c7148acb173829b1ea6a9c5f5aa0470e2e34e4da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parsinevis-doc"

RDEPENDS:${PN} += ""

inherit rpm
