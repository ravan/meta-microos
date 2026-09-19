SUMMARY = "Documentation for texlive-pst-coil"
DESCRIPTION = "This package includes the documentation for texlive-pst-coil"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.08svn77682"

RPM_NAME = "texlive-pst-coil-doc-2026.226.1.08svn77682-59.2.noarch.rpm"
RPM_HASH = "28294a23e737044e75b79709499a2dbd10f593625441e2abbdab03b68f64ffb32c58f43fa4baac6992e628f946f1ebead6144d54a9c5e7ba920c99a5ccd8b281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-coil-doc"

RDEPENDS:${PN} += ""

inherit rpm
