SUMMARY = "Documentation for texlive-pixelarttikz"
DESCRIPTION = "This package includes the documentation for texlive-pixelarttikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn77054"

RPM_NAME = "texlive-pixelarttikz-doc-2026.226.0.0.20asvn77054-58.2.noarch.rpm"
RPM_HASH = "f2f38bcfbce651b3304d8f88ef9462ef026dbb53ef61e58e0288e14fc49573432dff54fd2a9263ae3899c29c52c254c50072ea108cd6041ed75126abef2ba2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pixelarttikz-doc-fr \
texlive-pixelarttikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
