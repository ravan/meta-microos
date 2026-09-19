SUMMARY = "Documentation for texlive-udiss"
DESCRIPTION = "This package includes the documentation for texlive-udiss"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1svn75301"

RPM_NAME = "texlive-udiss-doc-2026.226.0.0.1svn75301-60.2.noarch.rpm"
RPM_HASH = "a93841537d368d4967656cdad078b22af0b4dc07bd74a82f0e3e939f88268ee67d12dceeed3f763b8e2cf7521bf15cfa3a8b0c9c9abd6ee6d94984e9de5bb826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-udiss-doc"

RDEPENDS:${PN} += ""

inherit rpm
