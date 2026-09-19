SUMMARY = "Documentation for texlive-chemformula-ru"
DESCRIPTION = "This package includes the documentation for texlive-chemformula-ru"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71883"

RPM_NAME = "texlive-chemformula-ru-doc-2026.226.svn71883-60.2.noarch.rpm"
RPM_HASH = "f23883244f5c6ab93263da3324c3e84cabfe42ac9c858a521bf79d54b7eac5b4e00248b6036293ac3c589b63c9941a868a568402e77e33012f7e25ecba011285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemformula-ru-doc-ru \
texlive-chemformula-ru-doc"

RDEPENDS:${PN} += ""

inherit rpm
