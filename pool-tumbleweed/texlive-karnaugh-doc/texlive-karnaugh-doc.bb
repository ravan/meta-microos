SUMMARY = "Documentation for texlive-karnaugh"
DESCRIPTION = "This package includes the documentation for texlive-karnaugh"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn21338"

RPM_NAME = "texlive-karnaugh-doc-2026.226.svn21338-63.2.noarch.rpm"
RPM_HASH = "ac2d113aa6c3c1f1129e9bc1544569c920d7db39b197422047d148c23ad8ee1491228bedbd72bc7f1097bf5907926bb05aab448017c0c3636174327eff679b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-karnaugh-doc"

RDEPENDS:${PN} += ""

inherit rpm
