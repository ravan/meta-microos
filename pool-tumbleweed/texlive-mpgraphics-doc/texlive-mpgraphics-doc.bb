SUMMARY = "Documentation for texlive-mpgraphics"
DESCRIPTION = "This package includes the documentation for texlive-mpgraphics"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn29776"

RPM_NAME = "texlive-mpgraphics-doc-2026.226.0.0.3svn29776-61.2.noarch.rpm"
RPM_HASH = "7f7c1267c8811b4bdde61f9a955ee0d6858f5746779db61ee4b5f97af47085829fb84a3595b9f51a1875469c5afe8f0b71ff3a491a3c9a6d23997be1055d0aaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpgraphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
