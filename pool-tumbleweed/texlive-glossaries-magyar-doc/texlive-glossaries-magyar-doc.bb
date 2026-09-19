SUMMARY = "Documentation for texlive-glossaries-magyar"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-magyar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-magyar-doc-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "3d7d934715feb86e4f2fe73c4bc59decd40567d790dda0a1618d1836b99eb47a5eb94eb03ba4847a789389b12b38ed1f4dad2b286baf191dfd535c68784331c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-magyar-doc"

RDEPENDS:${PN} += ""

inherit rpm
