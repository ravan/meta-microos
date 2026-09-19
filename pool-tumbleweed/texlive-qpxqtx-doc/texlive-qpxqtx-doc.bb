SUMMARY = "Documentation for texlive-qpxqtx"
DESCRIPTION = "This package includes the documentation for texlive-qpxqtx"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45797"

RPM_NAME = "texlive-qpxqtx-doc-2026.226.svn45797-60.4.noarch.rpm"
RPM_HASH = "7da7dd8bf102f27380142f263ac78f8b64abef20ea6e90ee8eb9cc7c42c6a57e4337e4ba3f50c5f024dbbb9859f138c30d54b45596a10286a6e7d62f5d2f4881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qpxqtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
