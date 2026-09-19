SUMMARY = "Documentation for texlive-ucharcat"
DESCRIPTION = "This package includes the documentation for texlive-ucharcat"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn38907"

RPM_NAME = "texlive-ucharcat-doc-2026.226.0.0.03svn38907-60.2.noarch.rpm"
RPM_HASH = "8c28fbd0a85e5b0d82afa616476ca021c0c81f19f23783d69193eeb5ef6c2944567bccc787d357cec17bafb3fc2c161fa6e0c286432c957995e6c5b2fffa5bd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucharcat-doc"

RDEPENDS:${PN} += ""

inherit rpm
