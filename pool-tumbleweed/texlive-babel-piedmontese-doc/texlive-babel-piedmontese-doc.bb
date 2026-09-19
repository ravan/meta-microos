SUMMARY = "Documentation for texlive-babel-piedmontese"
DESCRIPTION = "This package includes the documentation for texlive-babel-piedmontese"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn30282"

RPM_NAME = "texlive-babel-piedmontese-doc-2026.226.1.0svn30282-60.2.noarch.rpm"
RPM_HASH = "0f934026a60e4728b91b0b560220cab06ff73d114d5b63fa031a4ea16fa99e5b26a113df7aabb29b798e14c8aba079acaccf5d15bff73e3bb6dadcb3aab63ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-piedmontese-doc"

RDEPENDS:${PN} += ""

inherit rpm
