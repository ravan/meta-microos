SUMMARY = "Documentation for texlive-bitelist"
DESCRIPTION = "This package includes the documentation for texlive-bitelist"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn25779"

RPM_NAME = "texlive-bitelist-doc-2026.226.0.0.1svn25779-59.2.noarch.rpm"
RPM_HASH = "6f48475cc62b7b7c4647a381a309f5f5cf7cb5e1ef9298ea20a5c2b63d63780690970654eceb75ce5aeaa65f132649430df598d65bc3f55c6ea4281c6cce602d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitelist-doc"

RDEPENDS:${PN} += ""

inherit rpm
