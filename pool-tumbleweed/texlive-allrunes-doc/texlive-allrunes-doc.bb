SUMMARY = "Documentation for texlive-allrunes"
DESCRIPTION = "This package includes the documentation for texlive-allrunes"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.1svn42221"

RPM_NAME = "texlive-allrunes-doc-2026.226.2.1.1svn42221-61.2.noarch.rpm"
RPM_HASH = "fc53a8f5247445012770df620215cce84dd8e7ec5775c105128c93130510410ac37d0c96efa58eee0a0b79afbcf847f39eea449615665f2662eece5bd953349f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-allrunes-doc"

RDEPENDS:${PN} += ""

inherit rpm
