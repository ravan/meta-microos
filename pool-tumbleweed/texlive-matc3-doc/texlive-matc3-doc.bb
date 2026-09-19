SUMMARY = "Documentation for texlive-matc3"
DESCRIPTION = "This package includes the documentation for texlive-matc3"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn29845"

RPM_NAME = "texlive-matc3-doc-2026.226.1.0.1svn29845-59.2.noarch.rpm"
RPM_HASH = "3d99d549acf4fbc11e6590dd8f67c923615a581f26f0e7a642d25ef95be44891567870ac5c3e9db0e11b113175a4c2c301e4778ba63b1d9854b658d9c1aaf4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-matc3-doc-it \
texlive-matc3-doc"

RDEPENDS:${PN} += ""

inherit rpm
