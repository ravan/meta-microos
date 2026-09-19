SUMMARY = "Documentation for texlive-babel-icelandic"
DESCRIPTION = "This package includes the documentation for texlive-babel-icelandic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn51551"

RPM_NAME = "texlive-babel-icelandic-doc-2026.226.1.3svn51551-60.2.noarch.rpm"
RPM_HASH = "af97200ebbb7de3ff335ead392010f9a95e8297690b062d5438e87e83cd880b534b53818210395eaaea2bfe99e87094358ae6c77b153db60919a1d403a0f5d54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-icelandic-doc"

RDEPENDS:${PN} += ""

inherit rpm
