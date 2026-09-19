SUMMARY = "Documentation for texlive-jknapltx"
DESCRIPTION = "This package includes the documentation for texlive-jknapltx"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn19440"

RPM_NAME = "texlive-jknapltx-doc-2026.226.svn19440-63.2.noarch.rpm"
RPM_HASH = "4b04dee28c37e24d189242ef2f7d81705eb4dcd8743682e36e1282ab4f3cebf167239a61104d027cc03426a8ad2a6492b725ae1617d6ad8f98ee40f7549d9f62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jknapltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
