SUMMARY = "Documentation for texlive-quickreaction"
DESCRIPTION = "This package includes the documentation for texlive-quickreaction"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02.01svn66867"

RPM_NAME = "texlive-quickreaction-doc-2026.226.1.02.01svn66867-60.4.noarch.rpm"
RPM_HASH = "65abb85bc6b0005b3ab4abf379c5f9cde1277ce3bf577b8fba50bb216cad7dea194799d72c8c9d4e8f17d963c8750483c195e17a0fc19fa3bfd24905610b72d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quickreaction-doc"

RDEPENDS:${PN} += ""

inherit rpm
