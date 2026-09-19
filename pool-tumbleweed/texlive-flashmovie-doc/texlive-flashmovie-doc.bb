SUMMARY = "Documentation for texlive-flashmovie"
DESCRIPTION = "This package includes the documentation for texlive-flashmovie"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn25768"

RPM_NAME = "texlive-flashmovie-doc-2026.226.0.0.4svn25768-59.2.noarch.rpm"
RPM_HASH = "ab49309b9c0f439f53c5c4ea884ddd0b3d2ecca0ed2381d55ffcf505833e0e3baf160d00adc73c6f8ca73c70fde6e2676c86f53e8d6d7d903b8cae3f7cf493bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flashmovie-doc"

RDEPENDS:${PN} += ""

inherit rpm
