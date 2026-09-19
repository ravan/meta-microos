SUMMARY = "Documentation for texlive-chemmacros"
DESCRIPTION = "This package includes the documentation for texlive-chemmacros"
LICENSE = "LPPL-1.0"

PV = "2026.226.6.2asvn76924"

RPM_NAME = "texlive-chemmacros-doc-2026.226.6.2asvn76924-60.2.noarch.rpm"
RPM_HASH = "68053e4cd6185562d2326ec777e152ebfb190e0605f67038b1a170f0c53ef9e40d59f7fa7745aad79a4013539b8684e6e552639a4073ab5c784199a8afa59cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemmacros-doc-en \
texlive-chemmacros-doc"

RDEPENDS:${PN} += ""

inherit rpm
