SUMMARY = "Documentation for texlive-svg"
DESCRIPTION = "This package includes the documentation for texlive-svg"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.02ksvn77682"

RPM_NAME = "texlive-svg-doc-2026.226.2.02ksvn77682-64.2.noarch.rpm"
RPM_HASH = "d1dfa2587eb843ab9a7d488e3d2b51a0435c54ec353aab1252fecd93189af20ca119758fa26757e43a541c3c20107ba9b31b254450b25da290d8990ad9e46c37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svg-doc"

RDEPENDS:${PN} += ""

inherit rpm
