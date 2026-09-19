SUMMARY = "Documentation for texlive-exam-zh"
DESCRIPTION = "This package includes the documentation for texlive-exam-zh"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.6svn76834"

RPM_NAME = "texlive-exam-zh-doc-2026.226.0.0.2.6svn76834-59.2.noarch.rpm"
RPM_HASH = "8df87442171f265b5de6da5d388d980b1ef33afc33552484aa5c6841838f4b7069cacf1d9027bf9a165b5c52665d7b0bea8b2488aafd0bd3c3c071ecb9fee951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-exam-zh-doc-zh \
texlive-exam-zh-doc"

RDEPENDS:${PN} += ""

inherit rpm
