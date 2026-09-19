SUMMARY = "Documentation for texlive-glossaries-ukrainian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-ukrainian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77154"

RPM_NAME = "texlive-glossaries-ukrainian-doc-2026.226.1.0svn77154-60.4.noarch.rpm"
RPM_HASH = "f66bbde0e19cfc26a30c3a00f101c1843a17857098d56ebf5eeef776397204bca3c10b9ff22f90623f7d51a46e52b961fb4cb6e996928e14c7878dddb314954e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-ukrainian-doc"

RDEPENDS:${PN} += ""

inherit rpm
