SUMMARY = "Documentation for texlive-draftcopy"
DESCRIPTION = "This package includes the documentation for texlive-draftcopy"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.16svn15878"

RPM_NAME = "texlive-draftcopy-doc-2026.226.2.16svn15878-59.2.noarch.rpm"
RPM_HASH = "af761cae85d4371e31641b5d20201b6816f85da451e591cbdf40a67721da27e2130951bf6c01e2bce6fc4cfb32bb7474fc695901d60260104c5604c5bdbb9993"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-draftcopy-doc"

RDEPENDS:${PN} += ""

inherit rpm
