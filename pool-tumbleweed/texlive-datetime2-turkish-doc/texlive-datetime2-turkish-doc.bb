SUMMARY = "Documentation for texlive-datetime2-turkish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-turkish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn52331"

RPM_NAME = "texlive-datetime2-turkish-doc-2026.226.1.1svn52331-59.2.noarch.rpm"
RPM_HASH = "bb2b8f6a6459d80895138aba1bf2138a2a90cf90c5727bc8cd2a5afbf341efdcbcb5cc106a301a8dca7c20499a0bf62be97a35d8b4a264be2c4cdec0078963bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-turkish-doc"

RDEPENDS:${PN} += ""

inherit rpm
