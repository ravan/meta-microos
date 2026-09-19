SUMMARY = "Documentation for texlive-maine-thesis"
DESCRIPTION = "This package includes the documentation for texlive-maine-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.6svn77208"

RPM_NAME = "texlive-maine-thesis-doc-2026.226.2.0.6svn77208-59.2.noarch.rpm"
RPM_HASH = "08e5fdb3c52328d850bfdd02dd5dc822c46821b8b9756c87d1e8840ed99871afdd7f88c0abaa45a6f9ff52f48dcc9083afa5a0e7dc14afdaedb311958e0df2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maine-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
