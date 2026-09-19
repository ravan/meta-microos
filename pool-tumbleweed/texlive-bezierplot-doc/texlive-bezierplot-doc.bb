SUMMARY = "Documentation for texlive-bezierplot"
DESCRIPTION = "This package includes the documentation for texlive-bezierplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn72750"

RPM_NAME = "texlive-bezierplot-doc-2026.226.1.6svn72750-61.2.noarch.rpm"
RPM_HASH = "13597c216fc91b76a79a16803139e623b61a88ce56fb347063ab63c2d6bf90d9381eba9d84b895c66d5259a300f6d68172e65034967ce19c6236e0fefc1165b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bezierplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
