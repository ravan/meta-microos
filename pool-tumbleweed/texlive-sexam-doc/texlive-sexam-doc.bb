SUMMARY = "Documentation for texlive-sexam"
DESCRIPTION = "This package includes the documentation for texlive-sexam"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn46628"

RPM_NAME = "texlive-sexam-doc-2026.226.1svn46628-60.2.noarch.rpm"
RPM_HASH = "4ff9ed4ca091d8eca70174fee7d5cc4662ad5b155994a049f8561bb0ff823fe544f8ad95877a60376abc9b49765d34cc3b068ab6bc119d7ec24d292ee959456d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-sexam-doc-ar-dz \
texlive-sexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
