SUMMARY = "Documentation for texlive-itnumpar"
DESCRIPTION = "This package includes the documentation for texlive-itnumpar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-itnumpar-doc-2026.226.1.0svn15878-63.2.noarch.rpm"
RPM_HASH = "dac9f9288e134503cb74b22b6162e06e7574344b0b77a886c7815ae283cb15e8ab0c204b1e0573a19d5f722fd568b8af0002c3e2bbac8e701acb55d746fcc4de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-itnumpar-doc"

RDEPENDS:${PN} += ""

inherit rpm
