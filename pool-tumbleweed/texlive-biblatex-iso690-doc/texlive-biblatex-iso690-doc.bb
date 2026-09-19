SUMMARY = "Documentation for texlive-biblatex-iso690"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-iso690"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.1svn62866"

RPM_NAME = "texlive-biblatex-iso690-doc-2026.226.0.0.4.1svn62866-61.2.noarch.rpm"
RPM_HASH = "f1612b96d208f50a428aa7a4e78ff1724c61a7d14e585c64afc2b9ce7ff38c24f36a6fe4f41ca9dec181f1b8c742c769192a488c0845520d9cef1b44d14f8886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-iso690-doc"

RDEPENDS:${PN} += ""

inherit rpm
