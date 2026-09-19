SUMMARY = "Documentation for texlive-stocksize"
DESCRIPTION = "This package includes the documentation for texlive-stocksize"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.1svn77230"

RPM_NAME = "texlive-stocksize-doc-2026.226.2.0.1svn77230-64.2.noarch.rpm"
RPM_HASH = "63d0bf4b8dd347067cdfe06359abd13c04d67e2296d3a31b1a8a9d3d6e5292f8cac8f8af855db81ee8605598101d879128de62bc6870083a74523f1a07699e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stocksize-doc"

RDEPENDS:${PN} += ""

inherit rpm
