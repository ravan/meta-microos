SUMMARY = "Documentation for texlive-axessibility"
DESCRIPTION = "This package includes the documentation for texlive-axessibility"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-axessibility-doc-2026.226.3.0svn77682-60.2.noarch.rpm"
RPM_HASH = "b97f86a19e1a6ca37ccf41372b7636f9e713bf5d2be987b689fd9a1d6ae211826e84bf53dc86b7e2b5ec07c97e8f39e244dfea6db3fb4fd82348d5bcf5cc9aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-axessibility-doc"

RDEPENDS:${PN} += ""

inherit rpm
