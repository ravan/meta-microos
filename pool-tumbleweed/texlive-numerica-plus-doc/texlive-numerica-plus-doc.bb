SUMMARY = "Documentation for texlive-numerica-plus"
DESCRIPTION = "This package includes the documentation for texlive-numerica-plus"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.0svn76924"

RPM_NAME = "texlive-numerica-plus-doc-2026.226.3.0.0svn76924-61.2.noarch.rpm"
RPM_HASH = "ad685a54193e18aa1c3c9e947ec0a68d9c04ffe306b3aa39c1198741db7795bd17f08743db5b990dfe094d04e8c5ffe356cfad7c60cd9e82e8b38d709c09dbd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numerica-plus-doc"

RDEPENDS:${PN} += ""

inherit rpm
