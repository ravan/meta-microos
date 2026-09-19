SUMMARY = "Documentation for texlive-midnight"
DESCRIPTION = "This package includes the documentation for texlive-midnight"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-midnight-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "132c142ae0cb88ef8cb8264885bd6dbf6525208392ceab01c2670de06f89ed518c3d893ab6b03c14c6a811ff0588266b57f7b2fe62656c095be9248e2baa5243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-midnight-doc"

RDEPENDS:${PN} += ""

inherit rpm
