SUMMARY = "Documentation for texlive-txgreeks"
DESCRIPTION = "This package includes the documentation for texlive-txgreeks"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21839"

RPM_NAME = "texlive-txgreeks-doc-2026.226.1.0svn21839-59.2.noarch.rpm"
RPM_HASH = "7cc59aea2d5f93f99585d4d414dfc70ec5fbfee039bf866d938656ddc7a6c3bcf5bf51987542545e5dbfaa517c0f742ea15e86ce51bc4661b32a13fa83216b8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txgreeks-doc"

RDEPENDS:${PN} += ""

inherit rpm
