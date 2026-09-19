SUMMARY = "Documentation for texlive-babel-danish"
DESCRIPTION = "This package includes the documentation for texlive-babel-danish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3ssvn77682"

RPM_NAME = "texlive-babel-danish-doc-2026.226.1.3ssvn77682-60.2.noarch.rpm"
RPM_HASH = "2c6f0d022ad9f2c1047d0f6fbd45fac6c13f7ac8b67498ab8d1427259fe8a236603bccb961816423a9249e252d61aea283d47d6c3f647951f8738427dc79b1c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-danish-doc"

RDEPENDS:${PN} += ""

inherit rpm
