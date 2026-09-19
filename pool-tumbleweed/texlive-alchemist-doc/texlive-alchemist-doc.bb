SUMMARY = "Documentation for texlive-alchemist"
DESCRIPTION = "This package includes the documentation for texlive-alchemist"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.00svn66924"

RPM_NAME = "texlive-alchemist-doc-2026.226.1.00svn66924-61.2.noarch.rpm"
RPM_HASH = "26342eadb33a0dd30a2c29e3884ba6f6a0e2d963ac7d2218feca8fafaee16b7fd7d4938ac23fb1b73a7b5b7097bbead97e30f15cf1d48cb3042ecf74e4bb9970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alchemist-doc"

RDEPENDS:${PN} += ""

inherit rpm
