SUMMARY = "Documentation for texlive-pdfpagediff"
DESCRIPTION = "This package includes the documentation for texlive-pdfpagediff"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn37946"

RPM_NAME = "texlive-pdfpagediff-doc-2026.226.1.4svn37946-58.2.noarch.rpm"
RPM_HASH = "0d070d5f6846cb0b080a2b3201f1eca9c81379a2e11b4352c4ca31426eb9b640c901198637e2707fce4e9f678a4524c663d15f52cf3d31423a0690abb63345fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfpagediff-doc"

RDEPENDS:${PN} += ""

inherit rpm
