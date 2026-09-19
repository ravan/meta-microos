SUMMARY = "Documentation for texlive-accents"
DESCRIPTION = "This package includes the documentation for texlive-accents"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77682"

RPM_NAME = "texlive-accents-doc-2026.226.1.4svn77682-61.2.noarch.rpm"
RPM_HASH = "5a32a0ee69d4b1eb98fab39107df0b72adf7a6702b0722de6c9509787735929f9bcbec4c2d329dea0c461b670b5e69ffe7c124dd6c9b2998b18cfe7899e904f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-accents-doc"

RDEPENDS:${PN} += ""

inherit rpm
