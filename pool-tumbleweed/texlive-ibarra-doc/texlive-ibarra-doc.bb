SUMMARY = "Documentation for texlive-ibarra"
DESCRIPTION = "This package includes the documentation for texlive-ibarra"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-ibarra-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "668c4c4c163deaac3fd43fc6094cf90617893e11250e8477ce6f75a4afff2d2a75ca5b5d8fd8d0fbf344af43aa41b0df61ca3516ac04e54fd34e56d4b3e2514e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibarra-doc"

RDEPENDS:${PN} += ""

inherit rpm
