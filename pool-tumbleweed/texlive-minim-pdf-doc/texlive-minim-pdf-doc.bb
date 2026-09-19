SUMMARY = "Documentation for texlive-minim-pdf"
DESCRIPTION = "This package includes the documentation for texlive-minim-pdf"
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_1.7svn77682"

RPM_NAME = "texlive-minim-pdf-doc-2026.226.2025_1.7svn77682-61.2.noarch.rpm"
RPM_HASH = "9b0334b5d62b76fdd5f7b5321564d70cbefd79961f607459737c254d3227c05ab3c9175c5d599de6568a09e7d4155f40e3e50e2edf72ccea96e72f1099944024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
