SUMMARY = "Documentation for texlive-basque-date"
DESCRIPTION = "This package includes the documentation for texlive-basque-date"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn26477"

RPM_NAME = "texlive-basque-date-doc-2026.226.1.05svn26477-60.2.noarch.rpm"
RPM_HASH = "81341f5beca43d4102c4d9cfea089744166a3de9299f252834f2468764a05a677b9384654c3ba5bc8c1b6e8c68f9fef3b6035ea775dc18887971957dfb32e97f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-basque-date-doc"

RDEPENDS:${PN} += ""

inherit rpm
