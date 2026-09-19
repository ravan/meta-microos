SUMMARY = "Documentation for texlive-gofonts"
DESCRIPTION = "This package includes the documentation for texlive-gofonts"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-gofonts-doc-2026.226.svn78101-60.4.noarch.rpm"
RPM_HASH = "2697aba78b15ec3b916e3f51416f277e277da5f455410031c8061a4aaab9ea614449b04b873f8a260bc19889e37afc9b8952acb8d3e68271018aa068a224e87a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gofonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
