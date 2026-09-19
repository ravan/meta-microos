SUMMARY = "Documentation for texlive-thumbpdf"
DESCRIPTION = "This package includes the documentation for texlive-thumbpdf"
LICENSE = "LPPL-1.0"

PV = "2026.227.3.17svn62518"

RPM_NAME = "texlive-thumbpdf-doc-2026.227.3.17svn62518-62.2.noarch.rpm"
RPM_HASH = "e778d68e63befc69b0de5124926686f0e04809fbccb21f523c077cf3f8d43f4d51175ef0881538a60c07942c0f4292c71f6e6e0b0e6a3bdcef1d272444f9ab8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-thumbpdf.1 \
texlive-thumbpdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
