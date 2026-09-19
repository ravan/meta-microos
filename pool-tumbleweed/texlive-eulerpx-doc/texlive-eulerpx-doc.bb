SUMMARY = "Documentation for texlive-eulerpx"
DESCRIPTION = "This package includes the documentation for texlive-eulerpx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn63967"

RPM_NAME = "texlive-eulerpx-doc-2026.226.1.0svn63967-59.2.noarch.rpm"
RPM_HASH = "3cc48bb7f1b7871703e97d87777d7324eef2e2905968b2938333c7b27778fffc1dda51e0a9fdfd7eba90f8bcef1e1464b8344654ca68eac8450e4399f27a2429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eulerpx-doc"

RDEPENDS:${PN} += ""

inherit rpm
