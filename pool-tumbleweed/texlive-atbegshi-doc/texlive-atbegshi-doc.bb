SUMMARY = "Documentation for texlive-atbegshi"
DESCRIPTION = "This package includes the documentation for texlive-atbegshi"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.19svn77682"

RPM_NAME = "texlive-atbegshi-doc-2026.226.1.19svn77682-60.2.noarch.rpm"
RPM_HASH = "1153387f1d8abeb67ae789312a8e1f974731a5462563b71fd3b8b42057a3966e9c040d6855a2a0eaa2d073053346593de81bbc92bd76c5cd7f933ea5832c359f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atbegshi-doc"

RDEPENDS:${PN} += ""

inherit rpm
