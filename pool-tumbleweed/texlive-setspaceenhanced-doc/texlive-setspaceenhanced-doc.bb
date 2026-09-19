SUMMARY = "Documentation for texlive-setspaceenhanced"
DESCRIPTION = "This package includes the documentation for texlive-setspaceenhanced"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn76924"

RPM_NAME = "texlive-setspaceenhanced-doc-2026.226.1.04svn76924-60.2.noarch.rpm"
RPM_HASH = "df96ee5e9af0ff6a736500a1d1bcdb8956632daa4ff7a751423f03c16236f7dadeb2eb43779ee1e8c600fe5fbd8d556ac519e7138b6828aae6e7952f7209f677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-setspaceenhanced-doc"

RDEPENDS:${PN} += ""

inherit rpm
