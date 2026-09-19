SUMMARY = "Documentation for texlive-m-tx"
DESCRIPTION = "This package includes the documentation for texlive-m-tx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.63dsvn78106"

RPM_NAME = "texlive-m-tx-doc-2026.226.0.0.63dsvn78106-59.2.noarch.rpm"
RPM_HASH = "764291eaa08ea44eefc72f3a958c0104fce9e231d5073bc73edc5cebf05a015f8a2ad26b5c447f9a672932e4b5215e92a91912cfa4fc47ce3296d2b7be911e90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-prepmx.1 \
texlive-m-tx-doc"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
/usr/bin/texlua"

inherit rpm
