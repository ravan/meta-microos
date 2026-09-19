SUMMARY = "Documentation for texlive-variablelm"
DESCRIPTION = "This package includes the documentation for texlive-variablelm"
LICENSE = "LPPL-1.3c"

PV = "2026.226.1.2svn60014"

RPM_NAME = "texlive-variablelm-doc-2026.226.1.2svn60014-60.2.noarch.rpm"
RPM_HASH = "b7cef7f66be48133bf010fe0fad75c64d10cf0a5aed6f61d0ceb92cb17159dbdc2922438c9e8fcf6e0ef68e4fefdf5c1fa81ba4053f110c0e58bb1b73104c0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-variablelm-doc"

RDEPENDS:${PN} += ""

inherit rpm
