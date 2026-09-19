SUMMARY = "Documentation for texlive-iaria-lite"
DESCRIPTION = "This package includes the documentation for texlive-iaria-lite"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn78138"

RPM_NAME = "texlive-iaria-lite-doc-2026.226.0.0.9.1svn78138-60.2.noarch.rpm"
RPM_HASH = "dd9d36fa6e9c55991911e2e34dcf2702b778b8f3c00a41c195397d6cd6a3bde340c23a171bba05d680f0f1e8d85e6ab3ef578895b348ea12ce27ba8f68e2bdb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iaria-lite-doc"

RDEPENDS:${PN} += ""

inherit rpm
