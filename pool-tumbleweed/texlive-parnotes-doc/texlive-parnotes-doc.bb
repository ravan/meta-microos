SUMMARY = "Documentation for texlive-parnotes"
DESCRIPTION = "This package includes the documentation for texlive-parnotes"
LICENSE = "LPPL-1.0"

PV = "2026.226.3csvn77682"

RPM_NAME = "texlive-parnotes-doc-2026.226.3csvn77682-58.2.noarch.rpm"
RPM_HASH = "45d7858d15e753e13cbbb2ca8faa5cfd3138bf759718b2ac4d0369015b5bbb942de5ee464040811e7ac383c758c32bb7ec42556d01087dfea140065af3fa67dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
