SUMMARY = "Documentation for texlive-cyber"
DESCRIPTION = "This package includes the documentation for texlive-cyber"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn46776"

RPM_NAME = "texlive-cyber-doc-2026.226.2.2svn46776-61.2.noarch.rpm"
RPM_HASH = "e939b31168702f5cbf417cb850af850c2b203f41bb3fb27f547219bab094016d7878a46fd7950f2a1081b036cc2bab5a08104163637a62a9664b4e2c81ff3457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyber-doc"

RDEPENDS:${PN} += ""

inherit rpm
