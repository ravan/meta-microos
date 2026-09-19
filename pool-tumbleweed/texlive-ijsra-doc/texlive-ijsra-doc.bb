SUMMARY = "Documentation for texlive-ijsra"
DESCRIPTION = "This package includes the documentation for texlive-ijsra"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn44886"

RPM_NAME = "texlive-ijsra-doc-2026.226.1.1svn44886-60.2.noarch.rpm"
RPM_HASH = "6e6ff86cf627a56c47f26cd22ba3a63e3cb09bfce7a933d87d1b22d3a3cfcc25dd753563597033531bcff2a216ec2863048e3b9c42cd5edbbf47ee00275069dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijsra-doc"

RDEPENDS:${PN} += ""

inherit rpm
