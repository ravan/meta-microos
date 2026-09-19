SUMMARY = "Documentation for texlive-edmargin"
DESCRIPTION = "This package includes the documentation for texlive-edmargin"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn27599"

RPM_NAME = "texlive-edmargin-doc-2026.226.1.2svn27599-61.4.noarch.rpm"
RPM_HASH = "6486dcbc1dce57f958e476db469ef1b34b3df37874aaec97bba102548dc49442b7b147d6a14de207fa3bc8e71df11d6af4b53fc5d7f365cd4388b1e65f5907ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmargin-doc"

RDEPENDS:${PN} += ""

inherit rpm
