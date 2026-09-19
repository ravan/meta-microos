SUMMARY = "Documentation for texlive-pgfmorepages"
DESCRIPTION = "This package includes the documentation for texlive-pgfmorepages"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn54770"

RPM_NAME = "texlive-pgfmorepages-doc-2026.226.1.20svn54770-58.2.noarch.rpm"
RPM_HASH = "3faaaeba1395bc893492c478832dc5fa0eaa57dd4b9a088f4360abf509c225c005130ae0eff26546bc16eed650647370d40642f0de97901bf5db8ab489211eb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfmorepages-doc"

RDEPENDS:${PN} += ""

inherit rpm
