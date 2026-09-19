SUMMARY = "Documentation for texlive-pst-layout"
DESCRIPTION = "This package includes the documentation for texlive-pst-layout"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.95svn29803"

RPM_NAME = "texlive-pst-layout-doc-2026.226.0.0.95svn29803-59.2.noarch.rpm"
RPM_HASH = "476f062da741908086215a9dbf9d031eb0f8b6d54be9f7fd07441949c5085efa8d0bae0c45dfd0d69260c257c1115130e47ba002da2e810047c5ddfab0f7b8c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-layout-doc"

RDEPENDS:${PN} += ""

inherit rpm
