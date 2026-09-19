SUMMARY = "Documentation for texlive-stubs"
DESCRIPTION = "This package includes the documentation for texlive-stubs"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1.1svn75437"

RPM_NAME = "texlive-stubs-doc-2026.226.0.0.1.1svn75437-64.2.noarch.rpm"
RPM_HASH = "216e878366c520f72ba463e1013f6f103c462f9d19e3fb58cfc0536c6df3ad413804bebb1cf39d60110f54c9862bb193d7f162356f4140b5a03212eaba61d3b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stubs-doc"

RDEPENDS:${PN} += ""

inherit rpm
