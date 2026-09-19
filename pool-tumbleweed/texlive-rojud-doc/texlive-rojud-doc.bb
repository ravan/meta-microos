SUMMARY = "Documentation for texlive-rojud"
DESCRIPTION = "This package includes the documentation for texlive-rojud"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn56895"

RPM_NAME = "texlive-rojud-doc-2026.226.1.2svn56895-60.2.noarch.rpm"
RPM_HASH = "b62cc465b53fcbf4279efabf79da31ce832a19d4891075e560e759205b5f5583033a427cd26c7d8a3c0f15ee40a9460e3ffad6163a8b29693c83cde8b815e650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rojud-doc"

RDEPENDS:${PN} += ""

inherit rpm
