SUMMARY = "Documentation for texlive-vancouver"
DESCRIPTION = "This package includes the documentation for texlive-vancouver"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn76790"

RPM_NAME = "texlive-vancouver-doc-2026.226.1.0svn76790-60.2.noarch.rpm"
RPM_HASH = "dd54020b06fec3f5baffa57b7b3508f5722c06aa6978235aa921a6176bea08c5ddc60a6965d898cf89cae218360f935388850680724975069c3fb4ff36554cd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vancouver-doc"

RDEPENDS:${PN} += ""

inherit rpm
