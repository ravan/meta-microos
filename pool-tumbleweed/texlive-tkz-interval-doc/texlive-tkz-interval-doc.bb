SUMMARY = "Documentation for texlive-tkz-interval"
DESCRIPTION = "This package includes the documentation for texlive-tkz-interval"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0bsvn76924"

RPM_NAME = "texlive-tkz-interval-doc-2026.226.1.0bsvn76924-59.2.noarch.rpm"
RPM_HASH = "519782bc68113392947d4b0d1d5ac1c5ef221d660f1c6fb1e7ad9da22fdb00c3a9b72b76308ad3b1f0fa8ae4db711c3d0b829e4d421311284e0a7f0dd97925e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-interval-doc"

RDEPENDS:${PN} += ""

inherit rpm
