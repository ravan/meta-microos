SUMMARY = "Documentation for texlive-augie"
DESCRIPTION = "This package includes the documentation for texlive-augie"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn61719"

RPM_NAME = "texlive-augie-doc-2026.226.svn61719-60.2.noarch.rpm"
RPM_HASH = "428f980be9765c19f7eb5bf24772aee18cc3b906f537d47c0d9050e037eaca92cd51277c51839d0ab23fd692ce6e0f3af6014f98afdcc9cc51f3437d99eb7f3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-augie-doc"

RDEPENDS:${PN} += ""

inherit rpm
