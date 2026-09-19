SUMMARY = "Documentation for texlive-iwona"
DESCRIPTION = "This package includes the documentation for texlive-iwona"
LICENSE = "LPPL-1.3c"

PV = "2026.226.0.0.995bsvn77682"

RPM_NAME = "texlive-iwona-doc-2026.226.0.0.995bsvn77682-63.2.noarch.rpm"
RPM_HASH = "c593b8163709676e4cf13b6be09be8b13b660cadb07aeed78e303af64e8a1a95b133db231bef566887791cfcbd25a4e5a428277fac09034da99179827782043c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iwona-doc"

RDEPENDS:${PN} += ""

inherit rpm
