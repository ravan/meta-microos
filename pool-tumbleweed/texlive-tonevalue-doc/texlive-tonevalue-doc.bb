SUMMARY = "Documentation for texlive-tonevalue"
DESCRIPTION = "This package includes the documentation for texlive-tonevalue"
LICENSE = "Apache-1.0"

PV = "2026.226.1.0svn60058"

RPM_NAME = "texlive-tonevalue-doc-2026.226.1.0svn60058-59.2.noarch.rpm"
RPM_HASH = "08e2b34d946df0349ab857da36de78090bc1f7ff45fa3e5c1da7f851a772969161469868bb7d3dc1e8ae619dcf9bc975cf058f07749794a850f157cfd71f4960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tonevalue-doc"

RDEPENDS:${PN} += ""

inherit rpm
