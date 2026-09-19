SUMMARY = "Documentation for texlive-listliketab"
DESCRIPTION = "This package includes the documentation for texlive-listliketab"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-listliketab-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "3318b8f8df24f8245dc811fadd46ed1c2eb9dd017138a8ff74431afcbe8d4d11f8663326429dc3309174eb0e75f78b2b2086891a302635fb8014351ff288761b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listliketab-doc"

RDEPENDS:${PN} += ""

inherit rpm
