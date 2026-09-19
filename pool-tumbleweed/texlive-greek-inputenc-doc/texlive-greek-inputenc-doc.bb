SUMMARY = "Documentation for texlive-greek-inputenc"
DESCRIPTION = "This package includes the documentation for texlive-greek-inputenc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn66634"

RPM_NAME = "texlive-greek-inputenc-doc-2026.226.1.9svn66634-60.4.noarch.rpm"
RPM_HASH = "5250b0606c5dfdf612e6db610b8ad216be612d662712307c8a558fe22ca380760a38a800285eee77c9e9f3eddc350e39cd6a2e171934191ca28cf952485301a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greek-inputenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
