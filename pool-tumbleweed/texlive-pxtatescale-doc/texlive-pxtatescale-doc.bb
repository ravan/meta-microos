SUMMARY = "Documentation for texlive-pxtatescale"
DESCRIPTION = "This package includes the documentation for texlive-pxtatescale"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-pxtatescale-doc-2026.226.0.0.4svn77682-60.4.noarch.rpm"
RPM_HASH = "c3049ff9db700742d74ede9c40af99577b77bae35c13b9965888db3023b5746bbb433fcf6355b53ac499bc534975d971f9cdc0d5efb3a1d7952d043fcf3f2319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxtatescale-doc"

RDEPENDS:${PN} += ""

inherit rpm
