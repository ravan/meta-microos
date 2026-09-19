SUMMARY = "Documentation for texlive-rccol"
DESCRIPTION = "This package includes the documentation for texlive-rccol"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2csvn77682"

RPM_NAME = "texlive-rccol-doc-2026.226.1.2csvn77682-60.4.noarch.rpm"
RPM_HASH = "958ec75d1fb51099e4da09dcd10dd392dbb5774dd5a710affdd2e06464a2c42aa54b9e7c27dd0c23e23553d5133e7aee7e7fe6f50e705933cd384f5d13a2c7f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rccol-doc"

RDEPENDS:${PN} += ""

inherit rpm
