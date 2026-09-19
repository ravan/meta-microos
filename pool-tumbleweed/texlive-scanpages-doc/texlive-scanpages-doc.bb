SUMMARY = "Documentation for texlive-scanpages"
DESCRIPTION = "This package includes the documentation for texlive-scanpages"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05asvn42633"

RPM_NAME = "texlive-scanpages-doc-2026.226.1.05asvn42633-60.2.noarch.rpm"
RPM_HASH = "1d2c42d320cf52c198661886089bb6b8d56acc087eee8d380deb65c89dca0f628adcca11e37c597a710884d75f5136c99bf67513d5135d9cc231452d32eb75bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scanpages-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
