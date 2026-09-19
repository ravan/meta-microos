SUMMARY = "Documentation for texlive-prisma-flow-diagram"
DESCRIPTION = "This package includes the documentation for texlive-prisma-flow-diagram"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn74874"

RPM_NAME = "texlive-prisma-flow-diagram-doc-2026.226.1.0.0svn74874-59.2.noarch.rpm"
RPM_HASH = "62bff259483e8a982c03acdeacecb22440f725adad711d3ecc604098a5e63410420220fc3335d9622d7f2dce78145229d183d6272f3037a49987d663ecf48f41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prisma-flow-diagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
