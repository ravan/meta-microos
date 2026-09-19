SUMMARY = "Documentation for texlive-nodepthtext"
DESCRIPTION = "This package includes the documentation for texlive-nodepthtext"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.0svn73069"

RPM_NAME = "texlive-nodepthtext-doc-2026.226.0.0.1.0svn73069-61.2.noarch.rpm"
RPM_HASH = "0b8cdde1cf62b01c6dc6507cd8f7b6b14c213f059127ec5e2d66f1574c11d581a78e5d1fae17a3c8a1b4063767a793712d0af4f7878a747bc0b2e294d0d2a15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nodepthtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
