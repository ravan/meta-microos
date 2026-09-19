SUMMARY = "Documentation for texlive-ziffer"
DESCRIPTION = "This package includes the documentation for texlive-ziffer"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn32279"

RPM_NAME = "texlive-ziffer-doc-2026.226.2.1svn32279-59.4.noarch.rpm"
RPM_HASH = "9bd6d2dfc7864682a8d0692d5823493df0a77e7261ce92f5ff8f9e1bc747f9658c6b22f63551d01fd4a647024afd5b0ab1553189e35c1d44a472f622d54a13f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ziffer-doc"

RDEPENDS:${PN} += ""

inherit rpm
