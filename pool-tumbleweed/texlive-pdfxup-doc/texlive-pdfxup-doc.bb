SUMMARY = "Documentation for texlive-pdfxup"
DESCRIPTION = "This package includes the documentation for texlive-pdfxup"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.12svn71513"

RPM_NAME = "texlive-pdfxup-doc-2026.226.2.12svn71513-58.2.noarch.rpm"
RPM_HASH = "9d035888e2dd1bf26bd3dc71695079dd70999f4cece9b9134937f3e608e947c19590d2bce65cbd73892c0011c382d13fb15f07e2ada7ea10e0b5eee4bdc20640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfxup.1 \
texlive-pdfxup-doc"

RDEPENDS:${PN} += ""

inherit rpm
