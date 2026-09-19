SUMMARY = "Documentation for texlive-beamertheme-simpledarkblue"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-simpledarkblue"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.1svn73454"

RPM_NAME = "texlive-beamertheme-simpledarkblue-doc-2026.226.1.1svn73454-61.2.noarch.rpm"
RPM_HASH = "82cbda26b9e3e1afb9fe978643500e9eb4ff096b1a56a515a85e7d3bac89b1d11453b878975b5a65b5098deab6e7787edfeb47121eaac48a3bd2b77a1331c3b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-simpledarkblue-doc"

RDEPENDS:${PN} += ""

inherit rpm
