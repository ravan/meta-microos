SUMMARY = "Documentation for texlive-delimseasy"
DESCRIPTION = "This package includes the documentation for texlive-delimseasy"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77161"

RPM_NAME = "texlive-delimseasy-doc-2026.226.2.0svn77161-59.2.noarch.rpm"
RPM_HASH = "f368322f631f0c5e83cca85c770d2818249b146e1d87bab5a7cf790d7ce583515a44462546af163023933ff42d5cda3f239f77bf6db30b8505a59d33378ab357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-delimseasy-doc"

RDEPENDS:${PN} += ""

inherit rpm
