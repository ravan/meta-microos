SUMMARY = "Documentation for texlive-york-thesis"
DESCRIPTION = "This package includes the documentation for texlive-york-thesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.6svn23348"

RPM_NAME = "texlive-york-thesis-doc-2026.226.3.6svn23348-59.4.noarch.rpm"
RPM_HASH = "faf4c165a324e5b142c784d5510ade4dfaeb4b86209f80e5f7179bddb73684a37b3148fdf682b2c9fb4f9329d72072ce8e691a4c101eb0c270295034aae20030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-york-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
