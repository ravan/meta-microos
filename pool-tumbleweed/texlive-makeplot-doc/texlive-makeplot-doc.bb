SUMMARY = "Documentation for texlive-makeplot"
DESCRIPTION = "This package includes the documentation for texlive-makeplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.6svn15878"

RPM_NAME = "texlive-makeplot-doc-2026.226.1.0.6svn15878-59.2.noarch.rpm"
RPM_HASH = "abf8b1eeeb099d3d82cb9495ec598aa5e1164a0bdb9c78bda1b092d5eae78878409797c063676b2fe45ba452a57e6670e95abe4ef9b2933fa0e67e22f5e4a432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makeplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
