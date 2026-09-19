SUMMARY = "Documentation for texlive-versions"
DESCRIPTION = "This package includes the documentation for texlive-versions"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.55svn21921"

RPM_NAME = "texlive-versions-doc-2026.226.0.0.55svn21921-60.2.noarch.rpm"
RPM_HASH = "e32b66f3dfef6d88b5bbdb2860ecf8304c555f31e7c282e8f22341b7abbeac55111bce41a68811ecc86b84df40b932cb4b10d2ac32b0289e0f8ed668e810cdbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-versions-doc"

RDEPENDS:${PN} += ""

inherit rpm
