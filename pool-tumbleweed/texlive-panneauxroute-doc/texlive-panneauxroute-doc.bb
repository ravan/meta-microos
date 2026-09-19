SUMMARY = "Documentation for texlive-panneauxroute"
DESCRIPTION = "This package includes the documentation for texlive-panneauxroute"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.2svn73069"

RPM_NAME = "texlive-panneauxroute-doc-2026.226.0.0.1.2svn73069-58.2.noarch.rpm"
RPM_HASH = "cec8eec8613d96f58a9eaee9af9be9c99cd5e41b1552f87d109568dd98248875ca783c9cb1fc6a63debfb39bd78f2c79491e458ed83503f6518350e8dae0a5c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-panneauxroute-doc"

RDEPENDS:${PN} += ""

inherit rpm
