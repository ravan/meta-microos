SUMMARY = "Documentation for texlive-jumplines"
DESCRIPTION = "This package includes the documentation for texlive-jumplines"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn37553"

RPM_NAME = "texlive-jumplines-doc-2026.226.0.0.2svn37553-63.2.noarch.rpm"
RPM_HASH = "b01568505f780a33c84cfa13840f8bffee17bf1e5e683cd609ed6e4fdfde406ed438562cddcc09fff59eeaa4c3c224fe54851f3ce28dac47537b80ae6bada65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jumplines-doc"

RDEPENDS:${PN} += ""

inherit rpm
