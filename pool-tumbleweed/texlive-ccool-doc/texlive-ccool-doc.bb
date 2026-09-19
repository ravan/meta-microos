SUMMARY = "Documentation for texlive-ccool"
DESCRIPTION = "This package includes the documentation for texlive-ccool"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn76924"

RPM_NAME = "texlive-ccool-doc-2026.226.3.2svn76924-59.2.noarch.rpm"
RPM_HASH = "de46dc3ef85f2d7435da1de54e9860075130c9c92554be8d3017d6cf0701470ac6322c412c25184aa08060e431254bf4996cf50c3d23402bbf0b7ff586304a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccool-doc"

RDEPENDS:${PN} += ""

inherit rpm
