SUMMARY = "Documentation for texlive-parstat"
DESCRIPTION = "This package includes the documentation for texlive-parstat"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77123"

RPM_NAME = "texlive-parstat-doc-2026.226.1.0svn77123-58.2.noarch.rpm"
RPM_HASH = "496915a1a21dfbc68f435b67ac54c6fcacf0e2fa369381dacd36741b14c65d30f525010aca344ed1e3fea1139914c2114892478a236ed83e4225d0b50934a523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-parstat-doc"

RDEPENDS:${PN} += ""

inherit rpm
