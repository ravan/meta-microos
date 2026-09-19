SUMMARY = "Documentation for texlive-cite"
DESCRIPTION = "This package includes the documentation for texlive-cite"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.5svn77682"

RPM_NAME = "texlive-cite-doc-2026.226.5.5svn77682-60.2.noarch.rpm"
RPM_HASH = "bd72e3d46c6de18a8c1380a2b272fdefae756e42848a1c995ebfac4fcce026dd0b22ea6a011a891a5b4869665f730e47adfe1042e88c59d479229042c5cc474a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cite-doc"

RDEPENDS:${PN} += ""

inherit rpm
