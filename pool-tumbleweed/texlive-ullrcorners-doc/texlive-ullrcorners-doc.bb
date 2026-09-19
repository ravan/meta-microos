SUMMARY = "Documentation for texlive-ullrcorners"
DESCRIPTION = "This package includes the documentation for texlive-ullrcorners"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75278"

RPM_NAME = "texlive-ullrcorners-doc-2026.226.1.0svn75278-60.2.noarch.rpm"
RPM_HASH = "333ad57dd6cd12fedbc4799abcdbe63739c2f290affddd82b62f61da5d3e20c5d608f912ae1bc55caff866b1402c30a239d02624a29bbcfa8b3d11ea94bac870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ullrcorners-doc"

RDEPENDS:${PN} += ""

inherit rpm
