SUMMARY = "Documentation for texlive-typogrid"
DESCRIPTION = "This package includes the documentation for texlive-typogrid"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21svn24994"

RPM_NAME = "texlive-typogrid-doc-2026.226.0.0.21svn24994-59.2.noarch.rpm"
RPM_HASH = "559959f7f39fbf43f5c1af12fa48a32f6b476ce4e20592465e1ba19fd91ab9d484b0d75ea897c6357b4712635df7f4d1de17f1f73efd6f278278662fd424e7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typogrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
