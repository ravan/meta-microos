SUMMARY = "Documentation for texlive-minifp"
DESCRIPTION = "This package includes the documentation for texlive-minifp"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.96svn76924"

RPM_NAME = "texlive-minifp-doc-2026.226.0.0.96svn76924-61.2.noarch.rpm"
RPM_HASH = "9ce6a0819612c738706cd30af7a3b8726855d9d45ea9746308850f07ed2a4cb29de9ecbcc9def6b456123c282a8357d4509264ac899be0fcef0dfac076d1cb3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minifp-doc"

RDEPENDS:${PN} += ""

inherit rpm
