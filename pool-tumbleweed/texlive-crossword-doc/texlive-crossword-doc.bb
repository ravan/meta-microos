SUMMARY = "Documentation for texlive-crossword"
DESCRIPTION = "This package includes the documentation for texlive-crossword"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.15svn78219"

RPM_NAME = "texlive-crossword-doc-2026.226.1.15svn78219-61.2.noarch.rpm"
RPM_HASH = "d9eea220262a213b3d10eed14c9c2f130e58ee5ab9ab59178d4d1cd67cdb27ca89f41de08563379022563205c16fc0ae247f9ba69f5f4e9100e64191c1bde4c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossword-doc"

RDEPENDS:${PN} += ""

inherit rpm
