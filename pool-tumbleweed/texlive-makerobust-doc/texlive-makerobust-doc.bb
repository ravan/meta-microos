SUMMARY = "Documentation for texlive-makerobust"
DESCRIPTION = "This package includes the documentation for texlive-makerobust"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn78101"

RPM_NAME = "texlive-makerobust-doc-2026.226.2.0svn78101-59.2.noarch.rpm"
RPM_HASH = "d4063441e7a01ebc8fa6dc5a099c5bc19ea365a6157591987dec490be1888c83ccb902e273ef8c28b4fd1450644d6557980371958efe134d689e25cf50664618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-makerobust-doc-en \
texlive-makerobust-doc"

RDEPENDS:${PN} += ""

inherit rpm
