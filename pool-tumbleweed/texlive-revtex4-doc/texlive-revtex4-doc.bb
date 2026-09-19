SUMMARY = "Documentation for texlive-revtex4"
DESCRIPTION = "This package includes the documentation for texlive-revtex4"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.0asvn56589"

RPM_NAME = "texlive-revtex4-doc-2026.226.4.0asvn56589-60.4.noarch.rpm"
RPM_HASH = "e7eaf2194e745b27b064a488966227b744f35663dbb4afaf2b1beb3246934544d866834163325771c00478b7d9af356f9d1b3045dbb67694a2a324d4320e53a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex4-doc"

RDEPENDS:${PN} += ""

inherit rpm
