SUMMARY = "Documentation for texlive-drawmatrix"
DESCRIPTION = "This package includes the documentation for texlive-drawmatrix"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.0svn44471"

RPM_NAME = "texlive-drawmatrix-doc-2026.226.1.5.0svn44471-59.2.noarch.rpm"
RPM_HASH = "0ae575d4244a7bd3d160b99f3b7095ae74ca40d4ee1166371c568979dcc18e77535b6561d1b14f081eceeb9014e5843833c17f3ae8048282402d2031224a6c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drawmatrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
