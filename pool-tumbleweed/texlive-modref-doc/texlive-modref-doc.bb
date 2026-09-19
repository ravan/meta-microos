SUMMARY = "Documentation for texlive-modref"
DESCRIPTION = "This package includes the documentation for texlive-modref"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-modref-doc-2026.226.1.0svn15878-61.2.noarch.rpm"
RPM_HASH = "e98a51fc0903417d8319c28052f93ba11aebc66bda87602e8807a67d9ddb4ceb49517f01be253366d21e07188f74f6e712d5f4f9d3aba4f4545a2c622a857809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modref-doc"

RDEPENDS:${PN} += ""

inherit rpm
