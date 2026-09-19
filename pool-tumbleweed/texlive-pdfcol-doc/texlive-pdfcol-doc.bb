SUMMARY = "Documentation for texlive-pdfcol"
DESCRIPTION = "This package includes the documentation for texlive-pdfcol"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.7svn64469"

RPM_NAME = "texlive-pdfcol-doc-2026.226.1.7svn64469-58.2.noarch.rpm"
RPM_HASH = "d0d3aa1e027510174b805fa9d793a574f32834393d262e42b99eb7ff31d7cd0c0433ef71d7831ebec7ca789f2bc22ece9c355039fa7074a90a175b4eaa816814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcol-doc"

RDEPENDS:${PN} += ""

inherit rpm
