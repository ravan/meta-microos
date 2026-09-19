SUMMARY = "Documentation for texlive-subfloat"
DESCRIPTION = "This package includes the documentation for texlive-subfloat"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.14svn77682"

RPM_NAME = "texlive-subfloat-doc-2026.226.2.14svn77682-64.2.noarch.rpm"
RPM_HASH = "df05ac89fbcd596a96d2c5a2c75c75c1efef35231d5b271b81400d23b31367c0cc247cf7099cec6c0cda0b319b24a96d444774b7e287039b76bae96c1ce4e7ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
