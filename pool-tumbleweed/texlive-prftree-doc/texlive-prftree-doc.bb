SUMMARY = "Documentation for texlive-prftree"
DESCRIPTION = "This package includes the documentation for texlive-prftree"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-prftree-doc-2026.226.1.6svn77682-59.2.noarch.rpm"
RPM_HASH = "967384a9a6c8f65584c6f063627587bcf57d36bcbb360d01fe95fbd91c50228acbf8e526abc85707c6ac025e74938fbe044d25e9c4892b1903fb71d27ba3fc26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prftree-doc"

RDEPENDS:${PN} += ""

inherit rpm
