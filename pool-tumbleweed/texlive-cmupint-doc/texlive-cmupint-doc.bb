SUMMARY = "Documentation for texlive-cmupint"
DESCRIPTION = "This package includes the documentation for texlive-cmupint"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn54735"

RPM_NAME = "texlive-cmupint-doc-2026.226.1.1svn54735-60.2.noarch.rpm"
RPM_HASH = "a455dacc04b46c8dbc4262266f569979e83dc216465b5ba1c7cb41240eb47e942af92f69e3d3470162bf39d33ad4e6531573737e9dd50c1b783168ee4c3957e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmupint-doc"

RDEPENDS:${PN} += ""

inherit rpm
