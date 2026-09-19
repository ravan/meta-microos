SUMMARY = "Documentation for texlive-uowthesis"
DESCRIPTION = "This package includes the documentation for texlive-uowthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn19700"

RPM_NAME = "texlive-uowthesis-doc-2026.226.1.0asvn19700-60.2.noarch.rpm"
RPM_HASH = "43ce5b8ff95862026473d706deaf26a20d7d5c35b3ecf1c80eeb51f34e4c3f95e5cc51a95e587cf47580555f9af319e7ce01c1c2eaaafa0929fa671968b03533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uowthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
