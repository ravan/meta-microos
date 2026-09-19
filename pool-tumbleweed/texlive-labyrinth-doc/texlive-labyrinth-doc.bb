SUMMARY = "Documentation for texlive-labyrinth"
DESCRIPTION = "This package includes the documentation for texlive-labyrinth"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn33454"

RPM_NAME = "texlive-labyrinth-doc-2026.226.1.0svn33454-63.2.noarch.rpm"
RPM_HASH = "09322d175ea019de08691d0ea43e88dced73bc5113e1da684239f53665bd9330063f43dc360820168cda9cca65f7f09b21be3164a2627e54911aba674659633e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labyrinth-doc"

RDEPENDS:${PN} += ""

inherit rpm
