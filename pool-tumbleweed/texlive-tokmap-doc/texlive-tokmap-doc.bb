SUMMARY = "Documentation for texlive-tokmap"
DESCRIPTION = "This package includes the documentation for texlive-tokmap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75599"

RPM_NAME = "texlive-tokmap-doc-2026.226.1.0svn75599-59.2.noarch.rpm"
RPM_HASH = "eea59e79070869e87e04cc9f7090b9d939883e8e6a75d526ef4241f42a63bb4794049603927dd2a06161981bd2407f3e93e68b3c9d171f21c56b53f3f439de03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tokmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
