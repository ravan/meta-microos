SUMMARY = "Documentation for texlive-cascade"
DESCRIPTION = "This package includes the documentation for texlive-cascade"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn76924"

RPM_NAME = "texlive-cascade-doc-2026.226.1.2asvn76924-59.2.noarch.rpm"
RPM_HASH = "5f7b666b03fbfaafc67d832dce3e1753c01d79cba41183c3e024e2fe17cce2717da2aa1498fcdd9d1e6ce2ea877bdd6a4ad385f689789f968d09da6cb81d48b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cascade-doc-fr \
texlive-cascade-doc"

RDEPENDS:${PN} += ""

inherit rpm
