SUMMARY = "Documentation for texlive-sgame"
DESCRIPTION = "This package includes the documentation for texlive-sgame"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.15svn30959"

RPM_NAME = "texlive-sgame-doc-2026.226.2.15svn30959-60.2.noarch.rpm"
RPM_HASH = "a52cd3bf07e0993d2680b255a2f1bc167d6537eee99bc6a686c45c070132732c5bb75b95a85e1070d117c685afc5a25649e7e24008bd24ea9a2b92036d42ae10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sgame-doc"

RDEPENDS:${PN} += ""

inherit rpm
