SUMMARY = "Documentation for texlive-musuos"
DESCRIPTION = "This package includes the documentation for texlive-musuos"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1dsvn24857"

RPM_NAME = "texlive-musuos-doc-2026.226.1.1dsvn24857-61.2.noarch.rpm"
RPM_HASH = "e312e8212e680b5fba6d2eb6714fd42190171540bb03802923cd2efb029d76469c4845ae241c9b38d11ea3558fcfc826241789b1b10bb5224f814fa76c4cd2ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musuos-doc"

RDEPENDS:${PN} += ""

inherit rpm
