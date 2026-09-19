SUMMARY = "Documentation for texlive-polytable"
DESCRIPTION = "This package includes the documentation for texlive-polytable"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.6svn77682"

RPM_NAME = "texlive-polytable-doc-2026.226.0.0.8.6svn77682-59.2.noarch.rpm"
RPM_HASH = "e2d31fa83c526e218b6c3486bee39d9b3cbed33360944224105a91fa5afea07eb3e04b08a891c391f03d46b11a75c7b80a625fcb355e4244a1660f3416c7e196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polytable-doc"

RDEPENDS:${PN} += ""

inherit rpm
