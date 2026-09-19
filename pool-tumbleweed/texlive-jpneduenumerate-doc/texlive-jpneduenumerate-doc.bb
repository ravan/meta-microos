SUMMARY = "Documentation for texlive-jpneduenumerate"
DESCRIPTION = "This package includes the documentation for texlive-jpneduenumerate"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn72898"

RPM_NAME = "texlive-jpneduenumerate-doc-2026.226.1.3svn72898-63.2.noarch.rpm"
RPM_HASH = "8321fd60064b99583b51525d8e976cdc64016f27eaaeeb62b3fa7536e1f67eb5575821d43c4f225b73fb1529767c9d0ce22be1846873725b74b2be425e28326d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-jpneduenumerate-doc-en \
texlive-jpneduenumerate-doc"

RDEPENDS:${PN} += ""

inherit rpm
