SUMMARY = "Documentation for texlive-engrec"
DESCRIPTION = "This package includes the documentation for texlive-engrec"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-engrec-doc-2026.226.1.1svn15878-61.4.noarch.rpm"
RPM_HASH = "f30dc3d76ccbbd4003b62fa0e0bfae2b56cb1b809e0bdf1578d862a8ddfc723d82708866cf2c5b916fc67d0a149eeeefd2c28d9d91568dcabb7f21349060d329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-engrec-doc"

RDEPENDS:${PN} += ""

inherit rpm
