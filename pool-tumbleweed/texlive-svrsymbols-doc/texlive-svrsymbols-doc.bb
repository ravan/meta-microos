SUMMARY = "Documentation for texlive-svrsymbols"
DESCRIPTION = "This package includes the documentation for texlive-svrsymbols"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn50019"

RPM_NAME = "texlive-svrsymbols-doc-2026.226.2.0bsvn50019-64.2.noarch.rpm"
RPM_HASH = "e1712da5fd6843c6aea5ec1bddb379ae2d5f5694d95bc29cd74d6a285db94619b7d72cacb16a8619bc33113081c5fa3f7094e6b525abdf7e0665760c4918a856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svrsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
