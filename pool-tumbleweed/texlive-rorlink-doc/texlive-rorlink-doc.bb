SUMMARY = "Documentation for texlive-rorlink"
DESCRIPTION = "This package includes the documentation for texlive-rorlink"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn76790"

RPM_NAME = "texlive-rorlink-doc-2026.226.1.1.0svn76790-60.2.noarch.rpm"
RPM_HASH = "0e795522be1e3303469e550adbbe5e9081818317d1730dd457bb394cdd1300e744d4b6229833ffb941e768f42f92fb2d947f8eed7b55ee24384d4f6ff619c952"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rorlink-doc"

RDEPENDS:${PN} += ""

inherit rpm
