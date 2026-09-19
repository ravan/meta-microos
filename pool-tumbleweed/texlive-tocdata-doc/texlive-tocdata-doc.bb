SUMMARY = "Documentation for texlive-tocdata"
DESCRIPTION = "This package includes the documentation for texlive-tocdata"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.07svn77682"

RPM_NAME = "texlive-tocdata-doc-2026.226.2.07svn77682-59.2.noarch.rpm"
RPM_HASH = "e4079e9d6e17b771864c3654459c5a30808c02122c405e495cc1bb947c4bb60cb6dabfab3d838d25e1b60ad8cf9e93a0b43d6c91b1859dd0ca343b4c1d0a60a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocdata-doc"

RDEPENDS:${PN} += ""

inherit rpm
