SUMMARY = "Documentation for texlive-biblatex-spbasic"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-spbasic"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.04svn61439"

RPM_NAME = "texlive-biblatex-spbasic-doc-2026.226.0.0.04svn61439-61.2.noarch.rpm"
RPM_HASH = "58e8d3dce45d4e21e8f9c58302587a1c2a3ca03cbc581ca5497cbfb217e07175f718581e4420dcbb9b3ca4841562420f60bb0fb70eebf91424570bd98c15b71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-spbasic-doc"

RDEPENDS:${PN} += ""

inherit rpm
