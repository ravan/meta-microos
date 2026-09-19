SUMMARY = "Documentation for texlive-spelling"
DESCRIPTION = "This package includes the documentation for texlive-spelling"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.41svn73571"

RPM_NAME = "texlive-spelling-doc-2026.226.0.0.41svn73571-64.2.noarch.rpm"
RPM_HASH = "b23ddab10e656b3f8fd296165d168afe26079354639b0fea3f715a4554600664076d5b42fd513719869145969a9f4ea1b43d4fc042cab106660ac5b4417778ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spelling-doc"

RDEPENDS:${PN} += ""

inherit rpm
