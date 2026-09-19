SUMMARY = "Documentation for texlive-eqnlines"
DESCRIPTION = "This package includes the documentation for texlive-eqnlines"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77877"

RPM_NAME = "texlive-eqnlines-doc-2026.226.1.0svn77877-61.4.noarch.rpm"
RPM_HASH = "04dab402a544c4e99c6cc41e800dca07d4c12b772120d771aa1176a28888878e6ade25fce2ca487b3eaee8e6b91ac2776e81a48ade40004fc4c4d60f9ac1fdef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnlines-doc"

RDEPENDS:${PN} += ""

inherit rpm
