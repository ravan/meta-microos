SUMMARY = "Documentation for texlive-structmech"
DESCRIPTION = "This package includes the documentation for texlive-structmech"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn66724"

RPM_NAME = "texlive-structmech-doc-2026.226.1.2svn66724-64.2.noarch.rpm"
RPM_HASH = "92d7bb234c2ed079804f0ff2b30853703f08fbe2377e5806294b109fc26932b47638a64eb84b90c7818b4a67ac6bc2d50e8166c992abd58c8c87cee6804037c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-structmech-doc"

RDEPENDS:${PN} += ""

inherit rpm
