SUMMARY = "Documentation for texlive-lgreek"
DESCRIPTION = "This package includes the documentation for texlive-lgreek"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn21818"

RPM_NAME = "texlive-lgreek-doc-2026.226.svn21818-61.2.noarch.rpm"
RPM_HASH = "207bb0e66dbc8011716cfb2845302b0496abe13c4d31f50ac919058a3293dc59e048778e5205137503125e1753b5dae8338e408bc3d5af989b2ba0dddb09a465"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
