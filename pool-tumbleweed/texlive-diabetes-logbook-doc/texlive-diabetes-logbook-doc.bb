SUMMARY = "Documentation for texlive-diabetes-logbook"
DESCRIPTION = "This package includes the documentation for texlive-diabetes-logbook"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77161"

RPM_NAME = "texlive-diabetes-logbook-doc-2026.226.svn77161-59.2.noarch.rpm"
RPM_HASH = "466725ebf51fca9852334c7fc4979d3c858e2319f5734ef302721683846b1d4f79a94f81181b270c59166122420f115e71e43844827d85d93eb3b746ed8d03b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diabetes-logbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
