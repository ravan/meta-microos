SUMMARY = "Documentation for texlive-chembst"
DESCRIPTION = "This package includes the documentation for texlive-chembst"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.5svn76790"

RPM_NAME = "texlive-chembst-doc-2026.226.0.0.2.5svn76790-60.2.noarch.rpm"
RPM_HASH = "7fd3c98599e53f5f8e0e52c1989cb54e95cf71d0ba3a17f6b830a0c3a8447ea17ff1bb0f8bca1d8ccbca8a01bf6e44007c7b8ff147e7001bb9f98d021c4ce6da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chembst-doc"

RDEPENDS:${PN} += ""

inherit rpm
