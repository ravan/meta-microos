SUMMARY = "Documentation for texlive-fancytabs"
DESCRIPTION = "This package includes the documentation for texlive-fancytabs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn41549"

RPM_NAME = "texlive-fancytabs-doc-2026.226.1.9svn41549-59.2.noarch.rpm"
RPM_HASH = "d2af3a237a8433cf2f794b8bcc8246410742449ddb3d24d25d7fc1ea97ad75610724c98ff9202064bb3e000dbbd4b11adf916edbd3d0f79ea01a9b0dbed792da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancytabs-doc"

RDEPENDS:${PN} += ""

inherit rpm
