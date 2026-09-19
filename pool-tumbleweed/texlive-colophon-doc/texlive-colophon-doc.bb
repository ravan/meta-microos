SUMMARY = "Documentation for texlive-colophon"
DESCRIPTION = "This package includes the documentation for texlive-colophon"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-colophon-doc-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "d8d471febea1a00292ce4edd7c44ac4f0f920a5e9fa27ec032768adf1cf1a0d7bebc72a258faab768635a0e891c7334a7ea6ddeae64639756ed37be2188bd00d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colophon-doc"

RDEPENDS:${PN} += ""

inherit rpm
