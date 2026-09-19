SUMMARY = "Documentation for texlive-seqcalc"
DESCRIPTION = "This package includes the documentation for texlive-seqcalc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77561"

RPM_NAME = "texlive-seqcalc-doc-2026.226.1.0svn77561-60.2.noarch.rpm"
RPM_HASH = "3c5f864281e6a38bddcdadb1486534fbdf43d08772bf552e0d66d531233597acae32ddb12e5c8872e6c06b2ff403835b9fb33a7581c1b78739696c049e9d9022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seqcalc-doc"

RDEPENDS:${PN} += ""

inherit rpm
