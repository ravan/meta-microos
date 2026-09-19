SUMMARY = "Documentation for texlive-syllogism"
DESCRIPTION = "This package includes the documentation for texlive-syllogism"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-syllogism-doc-2026.226.1.2svn15878-64.2.noarch.rpm"
RPM_HASH = "c5f3370827863e0d3e77c35104dc0844bf166758004209636b1b68a52a901fe5fc07929076ed52b0a86220f73f6b2f61c6929ba57306b6164371366406c7dc72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-syllogism-doc"

RDEPENDS:${PN} += ""

inherit rpm
