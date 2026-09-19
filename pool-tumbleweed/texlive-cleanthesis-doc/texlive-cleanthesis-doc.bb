SUMMARY = "Documentation for texlive-cleanthesis"
DESCRIPTION = "This package includes the documentation for texlive-cleanthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.0svn51472"

RPM_NAME = "texlive-cleanthesis-doc-2026.226.0.0.4.0svn51472-60.2.noarch.rpm"
RPM_HASH = "9d74b3411342b7074f8ca7832981eb1e4cdc1b9b6b9bc4593713e37ea9d8b07f9fba8b2b9d54eba226578576f3bdb0502c1b00ddd3e96be559f7ec745a2dce57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cleanthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
