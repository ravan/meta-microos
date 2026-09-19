SUMMARY = "Documentation for texlive-context-squares"
DESCRIPTION = "This package includes the documentation for texlive-context-squares"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77881"

RPM_NAME = "texlive-context-squares-doc-2026.226.svn77881-61.2.noarch.rpm"
RPM_HASH = "7b74f2283de01d4cd5e65d475e8d5d10b4863269ad09319e592dde63854f0fff91e45c048879ea5af66569c975ecc9825b2c93ff3d2def586f31d88d7d22af48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-squares-doc"

RDEPENDS:${PN} += ""

inherit rpm
