SUMMARY = "Documentation for texlive-cqjtuthesis"
DESCRIPTION = "This package includes the documentation for texlive-cqjtuthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn77769"

RPM_NAME = "texlive-cqjtuthesis-doc-2026.226.1.0.2svn77769-61.2.noarch.rpm"
RPM_HASH = "59dc2b51b36930234df138489513b381f643e585d09fc7ac7274638c2efb9a4e8f742dd99ee8890299217504e2422b77aa9796f0d2a8a814138534279d654a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cqjtuthesis-doc-zh \
texlive-cqjtuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
