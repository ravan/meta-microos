SUMMARY = "Documentation for texlive-pdfbook2"
DESCRIPTION = "This package includes the documentation for texlive-pdfbook2"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.4svn76924"

RPM_NAME = "texlive-pdfbook2-doc-2026.226.1.4svn76924-58.2.noarch.rpm"
RPM_HASH = "228dcfee995d2ba51a41723700ab111e725963b432914a6c9891d0e644562d02861d71d51681051ea563ee7122753f3a2f1212febcd9bf901e8f5856bb047696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfbook2.1 \
texlive-pdfbook2-doc"

RDEPENDS:${PN} += ""

inherit rpm
