SUMMARY = "Documentation for texlive-assignment"
DESCRIPTION = "This package includes the documentation for texlive-assignment"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn20431"

RPM_NAME = "texlive-assignment-doc-2026.226.svn20431-60.2.noarch.rpm"
RPM_HASH = "6c4328c7e8c371bfbc7e993c5ac5c956221a6b73eee6083104fe06ad656d6badc195e30344936dc1bee3ae49195dfd761fb235eb3e623d087b2a28cdb345cdb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-assignment-doc"

RDEPENDS:${PN} += ""

inherit rpm
