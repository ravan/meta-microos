SUMMARY = "Documentation for texlive-gender"
DESCRIPTION = "This package includes the documentation for texlive-gender"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36464"

RPM_NAME = "texlive-gender-doc-2026.226.1.0svn36464-60.2.noarch.rpm"
RPM_HASH = "555fad87208278263e5ec15a7089863e9dee26ddcc699e0596e388b73b7a545eaaec6f84cac63bfeb9b97c557a8f3a7db6e70b21b2a6fe4214b190064d1b387e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gender-doc"

RDEPENDS:${PN} += ""

inherit rpm
