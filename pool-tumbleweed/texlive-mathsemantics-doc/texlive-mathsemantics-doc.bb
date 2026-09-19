SUMMARY = "Documentation for texlive-mathsemantics"
DESCRIPTION = "This package includes the documentation for texlive-mathsemantics"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn63241"

RPM_NAME = "texlive-mathsemantics-doc-2026.226.1.0.0svn63241-59.2.noarch.rpm"
RPM_HASH = "936f72c24a1320301f4a4b550faa587885f4785a1042c2c9ed13b9a3c9df014192c19934d3d48c282b601cfc98f69d6217cd4b476d511df35c86a727f4d96810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathsemantics-doc"

RDEPENDS:${PN} += ""

inherit rpm
