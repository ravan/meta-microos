SUMMARY = "Documentation for texlive-pst-soroban"
DESCRIPTION = "This package includes the documentation for texlive-pst-soroban"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-pst-soroban-doc-2026.226.1.0svn15878-60.4.noarch.rpm"
RPM_HASH = "aa773d9568f356bf9ac3ee767301da696febde68b3bdbc195c617f13e438d77f980a7701ea33f4bb2d79886d9938d1b32ef5acffd53e10d848d3d2db811373b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-soroban-doc"

RDEPENDS:${PN} += ""

inherit rpm
