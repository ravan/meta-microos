SUMMARY = "Documentation for texlive-papertex"
DESCRIPTION = "This package includes the documentation for texlive-papertex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn75878"

RPM_NAME = "texlive-papertex-doc-2026.226.1.2bsvn75878-58.2.noarch.rpm"
RPM_HASH = "7423b9cffff117d9dd247e9a5f9a7632664af1b093083c07419bbac20cfa1bf0d16450ce8d81d08527bbcccf6a0f5c2df6e8f48ce1e71da303f18c30802d6960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-papertex-doc"

RDEPENDS:${PN} += ""

inherit rpm
