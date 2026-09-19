SUMMARY = "Documentation for texlive-cellprops"
DESCRIPTION = "This package includes the documentation for texlive-cellprops"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0svn76924"

RPM_NAME = "texlive-cellprops-doc-2026.226.2.0svn76924-59.2.noarch.rpm"
RPM_HASH = "02ea9e5a27141a80248d37b4366660d0096db9628d43fb771184e1ae7033e90ab803020b285fc94c1b129900404247f7c6e1e721646e8243d7e1ef5bd51b08aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cellprops-doc"

RDEPENDS:${PN} += ""

inherit rpm
