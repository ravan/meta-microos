SUMMARY = "Documentation for texlive-othello"
DESCRIPTION = "This package includes the documentation for texlive-othello"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-othello-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "97966d236c2334735560f94e461021fecb434cc2bc37b3e00ab62a53c86d3f54514667ee8ce0943ae75954a102131734e92995ba6f6435d93af50180d0e4924e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-othello-doc"

RDEPENDS:${PN} += ""

inherit rpm
