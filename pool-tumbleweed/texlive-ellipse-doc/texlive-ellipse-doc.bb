SUMMARY = "Documentation for texlive-ellipse"
DESCRIPTION = "This package includes the documentation for texlive-ellipse"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn39025"

RPM_NAME = "texlive-ellipse-doc-2026.226.1.0svn39025-61.4.noarch.rpm"
RPM_HASH = "d3b7cf469655313a20e2c4d54e781616c40a2b022abbb39ba87ad41dffe8cc05f042a686cfc393df74c5f707722de7ab601e4166c0fd576ef5f8d8c552b00de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ellipse-doc"

RDEPENDS:${PN} += ""

inherit rpm
