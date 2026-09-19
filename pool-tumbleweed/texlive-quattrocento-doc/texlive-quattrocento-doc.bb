SUMMARY = "Documentation for texlive-quattrocento"
DESCRIPTION = "This package includes the documentation for texlive-quattrocento"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-quattrocento-doc-2026.226.svn77682-60.4.noarch.rpm"
RPM_HASH = "85bd13b33622bfad0f30726b33fba52c6b3e7ae0cb6596a4ee9ccbb548bcc090a4588e9a7040cff92fc1a488615ac1855308bf22ea8afa0aff8977659e8b1830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quattrocento-doc"

RDEPENDS:${PN} += ""

inherit rpm
