SUMMARY = "Documentation for texlive-xcolor-material"
DESCRIPTION = "This package includes the documentation for texlive-xcolor-material"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn42289"

RPM_NAME = "texlive-xcolor-material-doc-2026.226.0.0.1svn42289-59.4.noarch.rpm"
RPM_HASH = "adaec5d8d32b6ec3b4e81b801c9bd2eb8bfe5ace1a170c9ca897c1ef6dd880dd7b86d0679cac8757dc4c8f873aa029dbc0333f61ddcb13a1939f9b0603485ada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-material-doc"

RDEPENDS:${PN} += ""

inherit rpm
