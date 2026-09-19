SUMMARY = "Documentation for texlive-minim-math"
DESCRIPTION = "This package includes the documentation for texlive-minim-math"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_1.5svn73816"

RPM_NAME = "texlive-minim-math-doc-2026.226.2025_1.5svn73816-61.2.noarch.rpm"
RPM_HASH = "cd95c26c13cf76c4022e2882e3ebfd3dd970c1ba3e42fc5aa6d113bd7633ee1c66feb928b5c7ae04f65c02d089dc228cd4b477d528adfe7014f216d4402ec603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
