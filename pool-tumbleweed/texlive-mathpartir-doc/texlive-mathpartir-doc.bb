SUMMARY = "Documentation for texlive-mathpartir"
DESCRIPTION = "This package includes the documentation for texlive-mathpartir"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3.2svn77682"

RPM_NAME = "texlive-mathpartir-doc-2026.226.1.3.2svn77682-59.2.noarch.rpm"
RPM_HASH = "6bb9d7a5a67ba3063147cdc57d00115cdeca9a05491056748fe51bb49b683f31d728c066bb20c5640433db6e7abe2992803c76dc7cee180214ab03d781ecc364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathpartir-doc"

RDEPENDS:${PN} += ""

inherit rpm
