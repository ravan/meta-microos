SUMMARY = "Documentation for texlive-glosmathtools"
DESCRIPTION = "This package includes the documentation for texlive-glosmathtools"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn55920"

RPM_NAME = "texlive-glosmathtools-doc-2026.226.1.0.0svn55920-60.4.noarch.rpm"
RPM_HASH = "4ab252cbff235a2e95752b6b5f7c924e46554d1b5adfe8e85408b79bc4111b13a35b9331ac2443dfe0c3cb61c834dcc93cabc4cbefb2c0e7d1ee28b84c785e2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-glosmathtools-doc-fr \
texlive-glosmathtools-doc"

RDEPENDS:${PN} += ""

inherit rpm
