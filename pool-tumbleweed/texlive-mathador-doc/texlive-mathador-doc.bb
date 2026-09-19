SUMMARY = "Documentation for texlive-mathador"
DESCRIPTION = "This package includes the documentation for texlive-mathador"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn76924"

RPM_NAME = "texlive-mathador-doc-2026.226.0.0.1.1svn76924-59.2.noarch.rpm"
RPM_HASH = "d62a56c45e565816545d7a4ea790098ab1d28b9449962af238ec293162447faeabbf38d71a3292515fbf87b442a821c2458ebb74e8b9a9455b96b139ca6cb448"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mathador-doc-fr \
texlive-mathador-doc"

RDEPENDS:${PN} += ""

inherit rpm
