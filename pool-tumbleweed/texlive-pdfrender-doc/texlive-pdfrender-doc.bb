SUMMARY = "Documentation for texlive-pdfrender"
DESCRIPTION = "This package includes the documentation for texlive-pdfrender"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn77682"

RPM_NAME = "texlive-pdfrender-doc-2026.226.1.8svn77682-58.2.noarch.rpm"
RPM_HASH = "89b5c9512fef67a04159d8cec4e79d66eeb5c97f7a0367e04847c63af86b67adc64e0421d9bc49761f3c15960f023deeb02db35a4bcfb99cb49ecf4b08c480b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfrender-doc"

RDEPENDS:${PN} += ""

inherit rpm
