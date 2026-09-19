SUMMARY = "Documentation for texlive-forum"
DESCRIPTION = "This package includes the documentation for texlive-forum"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-forum-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "2c398e94d3195c99e108dbc051fe66ae7dc3448ca3e17f100e936fa3ae7c026221db2e036a3918dfade667e158de72c2d28e91c49080ad503feca77b4ef4d4a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-forum-doc"

RDEPENDS:${PN} += ""

inherit rpm
