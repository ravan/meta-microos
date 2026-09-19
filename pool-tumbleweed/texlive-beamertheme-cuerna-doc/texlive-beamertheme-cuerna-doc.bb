SUMMARY = "Documentation for texlive-beamertheme-cuerna"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-cuerna"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42161"

RPM_NAME = "texlive-beamertheme-cuerna-doc-2026.226.svn42161-61.2.noarch.rpm"
RPM_HASH = "b546c34e8c3f00b385be55bd3c4ff72871ab0a1acb5ba4d453ca0a162998461bb41393d78e45fd3621d8316deb63e750ee5179501057d70391e3a78cafb8492e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-cuerna-doc"

RDEPENDS:${PN} += ""

inherit rpm
