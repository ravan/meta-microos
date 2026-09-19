SUMMARY = "Documentation for texlive-isosigns"
DESCRIPTION = "This package includes the documentation for texlive-isosigns"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn76196"

RPM_NAME = "texlive-isosigns-doc-2026.226.2.1svn76196-63.2.noarch.rpm"
RPM_HASH = "2904a89411a6414d08c78d4c68467520326a3a3abf4cbfc50191da865113ab35469b90261019b8e2b482047aeb6f6412fa54e894eedf06709a901dabbd0337ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isosigns-doc"

RDEPENDS:${PN} += ""

inherit rpm
