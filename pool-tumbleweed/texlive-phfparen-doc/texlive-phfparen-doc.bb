SUMMARY = "Documentation for texlive-phfparen"
DESCRIPTION = "This package includes the documentation for texlive-phfparen"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn41859"

RPM_NAME = "texlive-phfparen-doc-2026.226.1.0svn41859-58.2.noarch.rpm"
RPM_HASH = "c0b0a66d6bc35b2a37d53f68a0fd44bb6a6d1a688615b2c6fcff9dd91793f259d5d8c5813a508a718db3659fa438523302cc38ce5f75bdb2cf816433c257af11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfparen-doc"

RDEPENDS:${PN} += ""

inherit rpm
