SUMMARY = "Documentation for texlive-biblatex-nejm"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-nejm"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn49839"

RPM_NAME = "texlive-biblatex-nejm-doc-2026.226.0.0.5.0svn49839-61.2.noarch.rpm"
RPM_HASH = "2cc080a240a798a18b26d9136b2710e5d3b6208fb16533cf15785eb975b0f39727540c962dd9132ae3b1461b9bb0a44f7b9253840577c9cadb2ba7e403823885"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-nejm-doc"

RDEPENDS:${PN} += ""

inherit rpm
