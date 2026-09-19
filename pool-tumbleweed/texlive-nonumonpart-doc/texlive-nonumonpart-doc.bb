SUMMARY = "Documentation for texlive-nonumonpart"
DESCRIPTION = "This package includes the documentation for texlive-nonumonpart"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn77682"

RPM_NAME = "texlive-nonumonpart-doc-2026.226.1svn77682-61.2.noarch.rpm"
RPM_HASH = "da6df9e8db66b2c351100552a7e3670147d06e44a5c3bf2250026cf594fa554f28fb76c7b98464760c7a0858e1b3d8d2886ff35f35fd2d1b085f855b1928fc76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nonumonpart-doc-fr;en \
texlive-nonumonpart-doc"

RDEPENDS:${PN} += ""

inherit rpm
