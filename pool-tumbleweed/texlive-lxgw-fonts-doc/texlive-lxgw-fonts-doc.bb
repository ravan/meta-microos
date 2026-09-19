SUMMARY = "Documentation for texlive-lxgw-fonts"
DESCRIPTION = "This package includes the documentation for texlive-lxgw-fonts"
LICENSE = "OFL-1.1"

PV = "2026.226.1.521nsvn77682"

RPM_NAME = "texlive-lxgw-fonts-doc-2026.226.1.521nsvn77682-59.2.noarch.rpm"
RPM_HASH = "b5574b461ed85993805792315176c77b8bd2cf4768f956378ec352772a36fa3557712e7c2e5e52a0ba9088b5c10e9849542970c9ad0f92f23d458d0008ee1d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lxgw-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
