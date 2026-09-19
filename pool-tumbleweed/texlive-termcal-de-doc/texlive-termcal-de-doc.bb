SUMMARY = "Documentation for texlive-termcal-de"
DESCRIPTION = "This package includes the documentation for texlive-termcal-de"
LICENSE = "LPPL-1.0"

PV = "2026.227.2.0svn47111"

RPM_NAME = "texlive-termcal-de-doc-2026.227.2.0svn47111-62.2.noarch.rpm"
RPM_HASH = "ee067beadd9e99aa2a1ca201d37f0fdce6b1333da3b240534bcf414a68f0e442253dfc2a50618ac042dbddb67f8f039f91858b9f2df7fb73901f7bd2a5ae0b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termcal-de-doc"

RDEPENDS:${PN} += ""

inherit rpm
