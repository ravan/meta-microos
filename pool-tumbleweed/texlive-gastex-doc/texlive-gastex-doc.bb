SUMMARY = "Documentation for texlive-gastex"
DESCRIPTION = "This package includes the documentation for texlive-gastex"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn69842"

RPM_NAME = "texlive-gastex-doc-2026.226.3.1svn69842-60.2.noarch.rpm"
RPM_HASH = "d4a5090e6bfeeaef9bc965e924bacd8dbe5b43b9001a7a788524ab9a95a67101e7d00c6218ab40217de83b4bc060307b5daaed3b283b2622d80a5f2dcb459b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gastex-doc"

RDEPENDS:${PN} += ""

inherit rpm
