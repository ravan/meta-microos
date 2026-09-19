SUMMARY = "Documentation for texlive-wsemclassic"
DESCRIPTION = "This package includes the documentation for texlive-wsemclassic"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.0.1svn31532"

RPM_NAME = "texlive-wsemclassic-doc-2026.226.1.0.1svn31532-59.4.noarch.rpm"
RPM_HASH = "320be39b3f11b20eda9797dacb55a1fc6bce655f6aa1b5e33145823a54c86a1061851ee92cb0d4f2c232798c4dbf4a8b44c5b519a5320fa9e1f24036a7b70a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wsemclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
