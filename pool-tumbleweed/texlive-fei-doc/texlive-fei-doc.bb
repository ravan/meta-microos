SUMMARY = "Documentation for texlive-fei"
DESCRIPTION = "This package includes the documentation for texlive-fei"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.10.4svn65352"

RPM_NAME = "texlive-fei-doc-2026.226.4.10.4svn65352-59.2.noarch.rpm"
RPM_HASH = "a2918c41659391d1304100b89ea9ec604dd9cb7f10f86aa520e5965decf7ea65ff8a6deeb30fb8571294eeb1969b0ec9af16f4c4892b0a7679d3d132792ae2cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fei-doc-pt-BR \
texlive-fei-doc"

RDEPENDS:${PN} += ""

inherit rpm
