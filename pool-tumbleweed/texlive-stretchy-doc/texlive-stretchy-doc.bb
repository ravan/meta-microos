SUMMARY = "Documentation for texlive-stretchy"
DESCRIPTION = "This package includes the documentation for texlive-stretchy"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn75140"

RPM_NAME = "texlive-stretchy-doc-2026.226.0.0.1svn75140-64.2.noarch.rpm"
RPM_HASH = "10d9c9910a2364d5c389dc127795a0320c007e14113536e47e4f17c1bd4e8c4e3a3310b446ec595637978ce9cfe34f812372a223fa9198026c9de61368959322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stretchy-doc"

RDEPENDS:${PN} += ""

inherit rpm
