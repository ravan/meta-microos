SUMMARY = "Documentation for texlive-doublestroke"
DESCRIPTION = "This package includes the documentation for texlive-doublestroke"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.111svn77682"

RPM_NAME = "texlive-doublestroke-doc-2026.226.1.111svn77682-59.2.noarch.rpm"
RPM_HASH = "528444400986def6184abe57fc92b8c74850718e2d5f7173c89f2dac6959aebc94a9f0e0cb90708cfe3d5be0e1d7069c6addab9e7cce77d127348ff5788209e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doublestroke-doc"

RDEPENDS:${PN} += ""

inherit rpm
