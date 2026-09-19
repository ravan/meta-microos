SUMMARY = "Documentation for texlive-simplivre"
DESCRIPTION = "This package includes the documentation for texlive-simplivre"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78004"

RPM_NAME = "texlive-simplivre-doc-2026.226.svn78004-64.2.noarch.rpm"
RPM_HASH = "a534001c2737e6e72cb8478243f09026b2459d12a1d26db92494176cc6465dfc0291d15c8051e40539e855a6f9cdbdcfeda04b75d300ad621221eb5c2a21678c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplivre-doc"

RDEPENDS:${PN} += ""

inherit rpm
