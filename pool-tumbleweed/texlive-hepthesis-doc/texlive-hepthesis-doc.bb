SUMMARY = "Documentation for texlive-hepthesis"
DESCRIPTION = "This package includes the documentation for texlive-hepthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.2svn46054"

RPM_NAME = "texlive-hepthesis-doc-2026.226.1.5.2svn46054-60.4.noarch.rpm"
RPM_HASH = "2f04277ab3abe5ff5d39002f2513a961718fa53132ae3fbb4ec45e3060336b2a7e4ebcee03bdd07e50735ae1b4186573a772e6dbb1b1a8813f3317146f41ac1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepthesis-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
