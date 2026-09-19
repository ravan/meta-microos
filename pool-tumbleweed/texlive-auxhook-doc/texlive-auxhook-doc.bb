SUMMARY = "Documentation for texlive-auxhook"
DESCRIPTION = "This package includes the documentation for texlive-auxhook"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-auxhook-doc-2026.226.1.6svn77682-60.2.noarch.rpm"
RPM_HASH = "b66f63d4a6c773e8391369ebc0c233ee7c26ebaceaf768bd0addfa33f9d17fed06e5e9fc24d89b64165a8719ecf5f45b5b7f27d9d8824cf94816d1876da8510e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-auxhook-doc"

RDEPENDS:${PN} += ""

inherit rpm
