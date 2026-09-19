SUMMARY = "Documentation for texlive-ebezier"
DESCRIPTION = "This package includes the documentation for texlive-ebezier"
LICENSE = "LPPL-1.0"

PV = "2026.226.4svn76924"

RPM_NAME = "texlive-ebezier-doc-2026.226.4svn76924-61.4.noarch.rpm"
RPM_HASH = "4bae9aac80f7bc3eecbba75aa1f139dda23a6f566aa7b3587bfaef2598d19e16bf1b49e3fdeb570db2ee545ab21a0689d733d6d8d2e916a14bea554086073123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebezier-doc"

RDEPENDS:${PN} += ""

inherit rpm
