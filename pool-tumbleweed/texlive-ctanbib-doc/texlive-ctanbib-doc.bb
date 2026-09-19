SUMMARY = "Documentation for texlive-ctanbib"
DESCRIPTION = "This package includes the documentation for texlive-ctanbib"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2dsvn68650"

RPM_NAME = "texlive-ctanbib-doc-2026.226.0.0.2dsvn68650-61.2.noarch.rpm"
RPM_HASH = "00c48499e07bf3618f87cc7cb37ad8c9c2eb6369ed619c42233a045ff20862de61bb23125eff23746b5e5a91743a2ed9ac07c05198193d01d2c4d9d07bae2537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ctanbib.1 \
texlive-ctanbib-doc"

RDEPENDS:${PN} += ""

inherit rpm
