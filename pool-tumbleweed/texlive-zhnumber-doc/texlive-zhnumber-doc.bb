SUMMARY = "Documentation for texlive-zhnumber"
DESCRIPTION = "This package includes the documentation for texlive-zhnumber"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-zhnumber-doc-2026.226.3.0svn77682-59.4.noarch.rpm"
RPM_HASH = "0ad09650773300029fcaed5c9c8ae59a30c6bd356cd8a66ef22f1ac5b61ec4e04b73591b467cea91701bec916478d1c9086698adc541ec072522545f8e1bd4e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zhnumber-doc-zh \
texlive-zhnumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
