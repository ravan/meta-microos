SUMMARY = "Documentation for texlive-secdot"
DESCRIPTION = "This package includes the documentation for texlive-secdot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-secdot-doc-2026.226.1.0svn77682-60.2.noarch.rpm"
RPM_HASH = "2801d2564a3cc9065c2e5c4be83f39810f8eb3e7d2d128203a878bad2544859dbc8f86da93353eddd680b74da299680475b6a2c3480a8b582e5fdaa314901556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-secdot-doc"

RDEPENDS:${PN} += ""

inherit rpm
