SUMMARY = "Documentation for texlive-zxjatype"
DESCRIPTION = "This package includes the documentation for texlive-zxjatype"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-zxjatype-doc-2026.226.0.0.7svn77682-59.4.noarch.rpm"
RPM_HASH = "4cbd3b173435567d20b515e47c188a80d802a83327f985abea829b55f35fe28fb29c031bcde85513c983611ae857d0af60e35ea4b6d1088436a0642a20c97f61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zxjatype-doc-ja \
texlive-zxjatype-doc"

RDEPENDS:${PN} += ""

inherit rpm
