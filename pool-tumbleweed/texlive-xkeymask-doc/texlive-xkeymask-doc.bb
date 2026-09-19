SUMMARY = "Documentation for texlive-xkeymask"
DESCRIPTION = "This package includes the documentation for texlive-xkeymask"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn69223"

RPM_NAME = "texlive-xkeymask-doc-2026.226.1.0svn69223-59.4.noarch.rpm"
RPM_HASH = "7a78e704530cb865bd42ad9395591aa092e3bbc6941af6d6a307d38f3640b97be7f1e1b99d8e0e1f688fc351b873368c9245ebf1a58e4879986b539b3ea4fa30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkeymask-doc"

RDEPENDS:${PN} += ""

inherit rpm
