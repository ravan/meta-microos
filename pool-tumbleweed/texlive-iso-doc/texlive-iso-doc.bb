SUMMARY = "Documentation for texlive-iso"
DESCRIPTION = "This package includes the documentation for texlive-iso"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn15878"

RPM_NAME = "texlive-iso-doc-2026.226.2.4svn15878-63.2.noarch.rpm"
RPM_HASH = "0f644769cd04e1cbaa756db278131df485f0345cc91f6ff2db137c9497b7229c8891538810233299f02f0dedeb35d755629bbfd82b45c855ec7ded002fd46090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-iso-doc"

RDEPENDS:${PN} += ""

inherit rpm
