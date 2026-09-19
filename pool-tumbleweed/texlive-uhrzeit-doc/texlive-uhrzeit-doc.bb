SUMMARY = "Documentation for texlive-uhrzeit"
DESCRIPTION = "This package includes the documentation for texlive-uhrzeit"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2csvn39570"

RPM_NAME = "texlive-uhrzeit-doc-2026.226.0.0.2csvn39570-60.2.noarch.rpm"
RPM_HASH = "90389f133656740909915364d112d06629e11d0e80eeebfac621259be3f0a6be883970e3916e0f05fa89ffdc540bb8bb6255115eaa9654c66acd95610c2535b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uhrzeit-doc"

RDEPENDS:${PN} += ""

inherit rpm
