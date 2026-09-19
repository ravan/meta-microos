SUMMARY = "Documentation for texlive-addlines"
DESCRIPTION = "This package includes the documentation for texlive-addlines"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-addlines-doc-2026.226.0.0.3svn77682-61.2.noarch.rpm"
RPM_HASH = "a72252ca59804c192e794f5193133041738bdacf17d02d30ac1aed99395bc174a39e522e4a65f85c517c091af1fa61bc0f696435f55bc2e13ea3be2a9c4633de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-addlines-doc"

RDEPENDS:${PN} += ""

inherit rpm
