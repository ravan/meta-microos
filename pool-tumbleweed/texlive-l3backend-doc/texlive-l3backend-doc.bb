SUMMARY = "Documentation for texlive-l3backend"
DESCRIPTION = "This package includes the documentation for texlive-l3backend"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-l3backend-doc-2026.226.svn76924-63.2.noarch.rpm"
RPM_HASH = "847d2d64f97605b5d9aa5705d2f51f4abbf25468bb9dee856c1462b873eb248d09920c33fbd4d52c3102c333225f5407330481ed9c3422b3964b357c430dc9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3backend-doc"

RDEPENDS:${PN} += ""

inherit rpm
