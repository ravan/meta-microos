SUMMARY = "Documentation for texlive-buctthesis"
DESCRIPTION = "This package includes the documentation for texlive-buctthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn67818"

RPM_NAME = "texlive-buctthesis-doc-2026.226.2.0svn67818-59.2.noarch.rpm"
RPM_HASH = "f45e33c0be4074874efb7a312f5ecc62c089f28e1eacdd056f1fab59687d4888de0341ae19812ef0dc3622241b2fe0e709d6c0e9b79988b1508c4a319f1027b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-buctthesis-doc-zh \
texlive-buctthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
