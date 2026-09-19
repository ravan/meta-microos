SUMMARY = "Documentation for texlive-pgfplots"
DESCRIPTION = "This package includes the documentation for texlive-pgfplots"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.18.2svn77682"

RPM_NAME = "texlive-pgfplots-doc-2026.226.1.18.2svn77682-58.2.noarch.rpm"
RPM_HASH = "a95e84d48eb641ea193c79c4d871ac82a395cd09c28d4a879d03ec515f3a5cf36ab557e9b835fc961c90cf8c1433008c5816864f7d422be101474f1b37074df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfplots-doc"

RDEPENDS:${PN} += ""

inherit rpm
