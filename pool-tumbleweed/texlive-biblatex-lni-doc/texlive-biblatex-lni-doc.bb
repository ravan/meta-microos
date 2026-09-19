SUMMARY = "Documentation for texlive-biblatex-lni"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-lni"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn73625"

RPM_NAME = "texlive-biblatex-lni-doc-2026.226.0.0.7svn73625-61.2.noarch.rpm"
RPM_HASH = "a1980bc3474af877f0dfce9eeacd7e88db43a92c6be2b384106b00733edd5d4fc7ef9b333cddc646dabce34a47b12c78c0db4fe6b14f14c1dffa3581986063fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-lni-doc"

RDEPENDS:${PN} += ""

inherit rpm
