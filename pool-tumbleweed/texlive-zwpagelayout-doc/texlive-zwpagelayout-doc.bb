SUMMARY = "Documentation for texlive-zwpagelayout"
DESCRIPTION = "This package includes the documentation for texlive-zwpagelayout"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4esvn63074"

RPM_NAME = "texlive-zwpagelayout-doc-2026.226.1.4esvn63074-59.4.noarch.rpm"
RPM_HASH = "2b5a9cdc1ae16790bfe798f7a99bcfeefa4af307a0b67cb92d43dd13418d87699641ee53c5e0808eab897a06dc0744139edc60904676bce9a75444fe97b12d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zwpagelayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
