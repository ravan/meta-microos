SUMMARY = "Documentation for texlive-pixelart"
DESCRIPTION = "This package includes the documentation for texlive-pixelart"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.2svn66012"

RPM_NAME = "texlive-pixelart-doc-2026.226.1.0.2svn66012-58.2.noarch.rpm"
RPM_HASH = "83ee19bd54fe5c503483f6b4f4c4a5b33b0f40197f8309be82491b11d7a13049bd68daee8d85f505a52d74c5f7fb5af2393ece28ebfbb925b71026eafcb487c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pixelart-doc"

RDEPENDS:${PN} += ""

inherit rpm
