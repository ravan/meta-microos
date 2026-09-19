SUMMARY = "Documentation for texlive-pdfcrop"
DESCRIPTION = "This package includes the documentation for texlive-pdfcrop"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.42svn66862"

RPM_NAME = "texlive-pdfcrop-doc-2026.226.1.42svn66862-58.2.noarch.rpm"
RPM_HASH = "8c0789976914153244601e40c72f3486963e36f2b59b4de554c1980c5b86f56e1ad39c639c813b1ca1da4b35d46cc1d8e9fbc629a8151cec1a7a0f7820cc9ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfcrop-doc"

RDEPENDS:${PN} += ""

inherit rpm
