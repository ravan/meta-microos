SUMMARY = "Documentation for texlive-glossaries-german"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-german"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-german-doc-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "90c4423f269ad6b5253b9b73204457ff4b3c8cad87cd8c68af9c5fbc4e0e593ec32aa069acaa301e4d692589f8554424bdf01814af506624f7b10c9979cc00c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
