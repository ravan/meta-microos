SUMMARY = "Documentation for texlive-centerlastline"
DESCRIPTION = "This package includes the documentation for texlive-centerlastline"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn56644"

RPM_NAME = "texlive-centerlastline-doc-2026.226.1.0svn56644-59.2.noarch.rpm"
RPM_HASH = "e03c49dfab6ba5beadaa0426055109af726d77bb2ab172a1ed87be269f2b6db1cefbdc8a9302f01c59234a183d9ad1a92e4969368e7fe809d0377304745defe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-centerlastline-doc"

RDEPENDS:${PN} += ""

inherit rpm
