SUMMARY = "Documentation for texlive-mp-geom2d"
DESCRIPTION = "This package includes the documentation for texlive-mp-geom2d"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77019"

RPM_NAME = "texlive-mp-geom2d-doc-2026.226.1.4svn77019-61.2.noarch.rpm"
RPM_HASH = "cfe794d7820b05fcd7d060a9aea63f00de03a44171d760825e768b0a61bd364ebbb5b98fc064fa5d4679f1eb4239979d54c86a45ef683306ecaba427baa9d918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mp-geom2d-doc-en;fr \
texlive-mp-geom2d-doc"

RDEPENDS:${PN} += ""

inherit rpm
