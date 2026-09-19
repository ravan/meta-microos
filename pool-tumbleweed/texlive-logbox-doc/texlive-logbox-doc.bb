SUMMARY = "Documentation for texlive-logbox"
DESCRIPTION = "This package includes the documentation for texlive-logbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24499"

RPM_NAME = "texlive-logbox-doc-2026.226.1.0svn24499-61.2.noarch.rpm"
RPM_HASH = "e62e3c529ce117259d9776008db2d3ad8646d1b5f1af7aebcce68dfc54e1b61f3b46cf1349a62c2e2e668161da68e831d5cf52d6e434db1e1e4a7ec1954e8b51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
