SUMMARY = "Documentation for texlive-timeop"
DESCRIPTION = "This package includes the documentation for texlive-timeop"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn75112"

RPM_NAME = "texlive-timeop-doc-2026.226.0.0.1.1svn75112-59.2.noarch.rpm"
RPM_HASH = "b9de911bb25c28e7010596562ab1eba1c980ad3f07d3ce42ba36ece41b5c9913309b1a4955aed426cdcdc20da3b7e6dd6e2f656223d7c425cc2c97267fff4dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-timeop-doc"

RDEPENDS:${PN} += ""

inherit rpm
