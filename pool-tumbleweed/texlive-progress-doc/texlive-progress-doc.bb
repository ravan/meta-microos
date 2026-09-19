SUMMARY = "Documentation for texlive-progress"
DESCRIPTION = "This package includes the documentation for texlive-progress"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn19519"

RPM_NAME = "texlive-progress-doc-2026.226.1.10svn19519-59.2.noarch.rpm"
RPM_HASH = "dcbd26bbb6708c77950d8dc34adf9b5b45b717d8ff844183519cdc99d184045a661a69b3267a94b8b664761d1ae0f29933c6aa75350df8db55390d4d2f6966ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-progress-doc"

RDEPENDS:${PN} += ""

inherit rpm
