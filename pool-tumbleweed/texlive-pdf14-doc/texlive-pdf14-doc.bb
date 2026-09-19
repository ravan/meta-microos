SUMMARY = "Documentation for texlive-pdf14"
DESCRIPTION = "This package includes the documentation for texlive-pdf14"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76924"

RPM_NAME = "texlive-pdf14-doc-2026.226.0.0.1svn76924-58.2.noarch.rpm"
RPM_HASH = "9b365e174fe827e702458d6fb5254ff6d4654b7a5482b390a39bc5712d5c224dad06e08cf856e9af97771698fe884d3666dbe94241ed3aea45950c6b88abd0fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdf14-doc"

RDEPENDS:${PN} += ""

inherit rpm
