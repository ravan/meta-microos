SUMMARY = "Documentation for texlive-sesamanuel"
DESCRIPTION = "This package includes the documentation for texlive-sesamanuel"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn36613"

RPM_NAME = "texlive-sesamanuel-doc-2026.226.0.0.6svn36613-60.2.noarch.rpm"
RPM_HASH = "0a4bc85f63efd9f2c51fd222b38a95a106dfab6a91ebe54b18f3b09ec8b9697bd9f977305019ba74be0bc7b24f6c3f79f0373bd89df2cba17656a3c596e5bb47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-sesamanuel-doc-fr \
texlive-sesamanuel-doc"

RDEPENDS:${PN} += ""

inherit rpm
