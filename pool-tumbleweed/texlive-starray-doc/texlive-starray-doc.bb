SUMMARY = "Documentation for texlive-starray"
DESCRIPTION = "This package includes the documentation for texlive-starray"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn78110"

RPM_NAME = "texlive-starray-doc-2026.226.2.1svn78110-64.2.noarch.rpm"
RPM_HASH = "df51fcf75439fdd3b61b5d38e9387ae082e32ae35c8a0d20d62a8e9bcbdbfba33d0e87fc3a55f1d6afbcf7e0b215fea08cda7313243d69702c3f0112ac680005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-starray-doc"

RDEPENDS:${PN} += ""

inherit rpm
