SUMMARY = "Documentation for texlive-custom-bib"
DESCRIPTION = "This package includes the documentation for texlive-custom-bib"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.33svn76790"

RPM_NAME = "texlive-custom-bib-doc-2026.226.4.33svn76790-61.2.noarch.rpm"
RPM_HASH = "f5342b142fc9b0dafd0c65f0f17a2e062bc8ba2c0e6e40829d4389f761de57e392e30e458919072fc83f9bcd51ab15d75c61664406e6780a12e508ea90bc79ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-custom-bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
