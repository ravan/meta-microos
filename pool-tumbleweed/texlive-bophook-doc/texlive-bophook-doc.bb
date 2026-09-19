SUMMARY = "Documentation for texlive-bophook"
DESCRIPTION = "This package includes the documentation for texlive-bophook"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn17062"

RPM_NAME = "texlive-bophook-doc-2026.226.0.0.02svn17062-59.2.noarch.rpm"
RPM_HASH = "e1548289684b1aa4948b1fcf195432622bd3f68f5711f8ab35755400d5cc181f068226784656b9dee4c0a4e46eb7075ec29eb1cf4a2431552366949b6b208b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bophook-doc"

RDEPENDS:${PN} += ""

inherit rpm
