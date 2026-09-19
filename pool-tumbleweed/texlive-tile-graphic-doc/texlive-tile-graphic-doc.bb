SUMMARY = "Documentation for texlive-tile-graphic"
DESCRIPTION = "This package includes the documentation for texlive-tile-graphic"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn55325"

RPM_NAME = "texlive-tile-graphic-doc-2026.226.svn55325-59.2.noarch.rpm"
RPM_HASH = "bacd791bb39b25759acef798a45dde7a532125e5e4b6b358e54bb6bb1b12b5ed0bdd8dadaf40d039f20b7d4175eb414d19a94d4caa032f43c1a403a16d7413fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tile-graphic-doc"

RDEPENDS:${PN} += ""

inherit rpm
