SUMMARY = "Documentation for texlive-nxuthesis"
DESCRIPTION = "This package includes the documentation for texlive-nxuthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn74831"

RPM_NAME = "texlive-nxuthesis-doc-2026.226.2.0.0svn74831-61.2.noarch.rpm"
RPM_HASH = "c5a81161aef01faddf4a52ec72e46cfc1366a41622b0fe9e7f506a196b2dd11b3705ac363225efb61cec89a83f94f3bec4c2d3fae49acfb38e4cb23ad6cbc1c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nxuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
