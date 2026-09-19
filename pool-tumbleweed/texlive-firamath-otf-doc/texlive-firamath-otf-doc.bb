SUMMARY = "Documentation for texlive-firamath-otf"
DESCRIPTION = "This package includes the documentation for texlive-firamath-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03bsvn77682"

RPM_NAME = "texlive-firamath-otf-doc-2026.226.0.0.03bsvn77682-59.2.noarch.rpm"
RPM_HASH = "8754267af52619e433ce1a13ce18fc5d0ec1b71f494201f68e30c3693ed0f8262bd1fa3d2a3b00f129033329c27d636f779e335de5b529825b11ab5499f0f189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firamath-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
