SUMMARY = "Documentation for texlive-freealign"
DESCRIPTION = "This package includes the documentation for texlive-freealign"
LICENSE = "LPPL-1.0"

PV = "2026.226.2024asvn69267"

RPM_NAME = "texlive-freealign-doc-2026.226.2024asvn69267-60.2.noarch.rpm"
RPM_HASH = "4b6bfc309abde4143a7a4fe1f1cd34550ebc876ce0f5f7c54da03f4c31c3af04f522f402c9edf0bf01ac072b0d40564b012813c9a6d3ebea187b984295e2f6b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-freealign-doc"

RDEPENDS:${PN} += ""

inherit rpm
