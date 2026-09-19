SUMMARY = "Documentation for texlive-oubraces"
DESCRIPTION = "This package includes the documentation for texlive-oubraces"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-oubraces-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "6b7f01ad7f4672b25ed173d2149c4c84fd5fac174e95f89ca49d3b752d56847d04edda50255753f91c257a1180fd3a7301c5fdd098edcb41a8abe0fdc94287ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oubraces-doc"

RDEPENDS:${PN} += ""

inherit rpm
