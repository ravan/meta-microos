SUMMARY = "Documentation for texlive-stealcaps"
DESCRIPTION = "This package includes the documentation for texlive-stealcaps"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn64967"

RPM_NAME = "texlive-stealcaps-doc-2026.226.1.1svn64967-64.2.noarch.rpm"
RPM_HASH = "b42067913d7838873b55bc7a40221dc86f142fcad3b62d9da23353578969fbd84ee9f786346827fd9b21b10e4a7f7de8eed21e4e9c310a051a684017828646ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stealcaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
