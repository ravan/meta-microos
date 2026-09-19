SUMMARY = "Documentation for texlive-revtex4-1"
DESCRIPTION = "This package includes the documentation for texlive-revtex4-1"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.1ssvn56590"

RPM_NAME = "texlive-revtex4-1-doc-2026.226.4.1ssvn56590-60.4.noarch.rpm"
RPM_HASH = "8f2e8d2ad9652734b75b37dd350f51c4959a6eeaff10fd8be55cd125835dd0da2296725d8bddca4d953437759570e5c12b74907d49b21d692011a8ee04457a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-revtex4-1-doc"

RDEPENDS:${PN} += ""

inherit rpm
