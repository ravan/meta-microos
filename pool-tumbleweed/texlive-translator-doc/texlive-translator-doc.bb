SUMMARY = "Documentation for texlive-translator"
DESCRIPTION = "This package includes the documentation for texlive-translator"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12dsvn77682"

RPM_NAME = "texlive-translator-doc-2026.226.1.12dsvn77682-59.2.noarch.rpm"
RPM_HASH = "044d4e7c8cf793e406675e9520ced3652cc2664ff44904a0f067697352f01129d980b1d8795def6417d3a94cc54230780989ef620cf054aa8d72291259ef1661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translator-doc"

RDEPENDS:${PN} += ""

inherit rpm
