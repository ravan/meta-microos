SUMMARY = "Documentation for texlive-inlinelabel"
DESCRIPTION = "This package includes the documentation for texlive-inlinelabel"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn63853"

RPM_NAME = "texlive-inlinelabel-doc-2026.226.1.2.1svn63853-60.2.noarch.rpm"
RPM_HASH = "d35c28ef19d7e85b76c6c26099de37bb34c5a6e2a30144f8642c294dfc329fdc48443235c01ec3b1361ff46e6f7ba36ddf6ea37b5114c2c16ce4d67c7e1064c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinelabel-doc"

RDEPENDS:${PN} += ""

inherit rpm
