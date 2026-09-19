SUMMARY = "Documentation for texlive-aspen"
DESCRIPTION = "This package includes the documentation for texlive-aspen"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.27svn78101"

RPM_NAME = "texlive-aspen-doc-2026.226.1.27svn78101-60.2.noarch.rpm"
RPM_HASH = "ab4cbdc75e23806d0a2502c85ba82ed9cad31babaa938b5585e8a2b664c1882ca4bcd16c343d289d4eff9f6c9b0414645bebfcfe4ce0d5d60e70632e6f8a7ab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aspen-doc"

RDEPENDS:${PN} += ""

inherit rpm
