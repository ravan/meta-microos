SUMMARY = "Documentation for texlive-anonymous-acm"
DESCRIPTION = "This package includes the documentation for texlive-anonymous-acm"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55121"

RPM_NAME = "texlive-anonymous-acm-doc-2026.226.1.0svn55121-61.2.noarch.rpm"
RPM_HASH = "87198deca8bdb3e98da041e3c54f21122ad11bc81af09a8c2358e08746e539c33f57d7163c1be77b6daa55ec1dcd3d341d64f0b7ec90054fc892b6e859d206af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anonymous-acm-doc"

RDEPENDS:${PN} += ""

inherit rpm
