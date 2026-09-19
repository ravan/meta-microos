SUMMARY = "Documentation for texlive-sectionbox"
DESCRIPTION = "This package includes the documentation for texlive-sectionbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn37749"

RPM_NAME = "texlive-sectionbox-doc-2026.226.1.01svn37749-60.2.noarch.rpm"
RPM_HASH = "7fc815ff19767c3df84279eb04a8007cd30bec1ca53e33cafec49bc3f84df9f09e011dfa430f31d859f3684e0e0cc186f02c9310b2573980bb0f1a26b78cfc2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sectionbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
