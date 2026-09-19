SUMMARY = "Documentation for texlive-glossaries-italian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-italian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-italian-doc-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "4056fb22f37c5d1e615a804b3f9fbcd93c4b90a78a62bbe6a10e1efb8e489da385ae5c26a6c3645f1b9e1c13a8f906382093bb92146238e1cb37b4d8cb265494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-italian-doc"

RDEPENDS:${PN} += ""

inherit rpm
