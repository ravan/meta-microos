SUMMARY = "Documentation for texlive-vntex"
DESCRIPTION = "This package includes the documentation for texlive-vntex"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2.2svn62837"

RPM_NAME = "texlive-vntex-doc-2026.226.3.2.2svn62837-60.2.noarch.rpm"
RPM_HASH = "f67619b1365b59e0c67eb97af8c16490ae86b379e7b69466476ca6d3c4e6778b352b94e6b1d611e5e6ff5a22fd23d82273a689fe5a7d5f330984a22e333c4789"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-vntex-doc-en;vi \
texlive-vntex-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
