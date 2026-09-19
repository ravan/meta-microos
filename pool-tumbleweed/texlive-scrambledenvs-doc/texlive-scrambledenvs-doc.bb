SUMMARY = "Documentation for texlive-scrambledenvs"
DESCRIPTION = "This package includes the documentation for texlive-scrambledenvs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn60615"

RPM_NAME = "texlive-scrambledenvs-doc-2026.226.1.1.0svn60615-60.2.noarch.rpm"
RPM_HASH = "92b634da08c4c27fe702fc0414b78ba1810119ba56171f340fa1ce1a28b5e9c7728b580d1a7954f3caa4b4204a0611531484ad49d11a09e372da94095c2ca77e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrambledenvs-doc"

RDEPENDS:${PN} += ""

inherit rpm
