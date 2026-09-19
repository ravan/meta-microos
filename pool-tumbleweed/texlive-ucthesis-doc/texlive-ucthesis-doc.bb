SUMMARY = "Documentation for texlive-ucthesis"
DESCRIPTION = "This package includes the documentation for texlive-ucthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn15878"

RPM_NAME = "texlive-ucthesis-doc-2026.226.3.2svn15878-60.2.noarch.rpm"
RPM_HASH = "31d8e0b15a5c7cf0e3349a2fdfbc41aa00a2286676e9bfa0489cc9f1f757a7930b916f01a89b67e86655781776f670f54f08478c94002d0cc25087820888a061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
