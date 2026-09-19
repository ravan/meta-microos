SUMMARY = "Documentation for texlive-scientific-thesis-cover"
DESCRIPTION = "This package includes the documentation for texlive-scientific-thesis-cover"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0.2svn47923"

RPM_NAME = "texlive-scientific-thesis-cover-doc-2026.226.4.0.2svn47923-60.2.noarch.rpm"
RPM_HASH = "27a175e5d009cddb3f3df3901a8c254de4a6c6980675bd409db44e940dfbaf7a9d29b0cb9c6bc07fd208e2118c07304546821daf6849e2c8391a815af7053242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scientific-thesis-cover-doc"

RDEPENDS:${PN} += ""

inherit rpm
