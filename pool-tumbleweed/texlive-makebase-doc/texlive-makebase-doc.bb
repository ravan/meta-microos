SUMMARY = "Documentation for texlive-makebase"
DESCRIPTION = "This package includes the documentation for texlive-makebase"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn41012"

RPM_NAME = "texlive-makebase-doc-2026.226.0.0.2svn41012-59.2.noarch.rpm"
RPM_HASH = "bb23740ad9932aca687d3e060e969290e30f051f00f59409b4fb911dbaf22e1d715a4175d48a99bdedc9dd309cc88619ff79b23396c06d24067682074c38a6bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makebase-doc"

RDEPENDS:${PN} += ""

inherit rpm
