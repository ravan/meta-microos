SUMMARY = "Documentation for texlive-kurdishlipsum"
DESCRIPTION = "This package includes the documentation for texlive-kurdishlipsum"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-kurdishlipsum-doc-2026.226.1.1svn77682-63.2.noarch.rpm"
RPM_HASH = "9d139d55b2c457b08a8755dea8b770b524d53a8774967c7f89bcf55f14a2ea8beac3d3ef5430e56c5f8536e147e504615d2871d42b976eed412a3bfb2ec926b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kurdishlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
