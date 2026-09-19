SUMMARY = "Documentation for texlive-physunits"
DESCRIPTION = "This package includes the documentation for texlive-physunits"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn58728"

RPM_NAME = "texlive-physunits-doc-2026.226.1.2.0svn58728-58.2.noarch.rpm"
RPM_HASH = "4e585ad031f49e0113d6edcac96c7316e5a5ac7c120d40ac53d705e1cbc03b8bf68751ae4ff8640146cab63da27e1f69a1d3493e78b31459969f90e7fcb2b665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-physunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
