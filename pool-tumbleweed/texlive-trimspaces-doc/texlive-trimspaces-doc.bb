SUMMARY = "Documentation for texlive-trimspaces"
DESCRIPTION = "This package includes the documentation for texlive-trimspaces"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-trimspaces-doc-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "90ecfd49dce114d2494d3460c8ef04a103950b38cbfd390e866f8b06a47a1c084309127e375319b89a26be4de4ceb4b3410832dab0bdcc944085b2b4789bf666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trimspaces-doc"

RDEPENDS:${PN} += ""

inherit rpm
