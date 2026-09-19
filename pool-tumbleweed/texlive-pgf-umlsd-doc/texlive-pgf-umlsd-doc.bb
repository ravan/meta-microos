SUMMARY = "Documentation for texlive-pgf-umlsd"
DESCRIPTION = "This package includes the documentation for texlive-pgf-umlsd"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7svn55342"

RPM_NAME = "texlive-pgf-umlsd-doc-2026.226.0.0.7svn55342-58.2.noarch.rpm"
RPM_HASH = "98e4a43763fccda33ea60b85636e9079e21e73dabc5ed27a649286204e40d80232148de43242de4fb38e16281d2134be428c46920f9bf78d8f7e184767effe3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-umlsd-doc"

RDEPENDS:${PN} += ""

inherit rpm
