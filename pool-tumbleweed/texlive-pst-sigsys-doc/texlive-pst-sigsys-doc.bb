SUMMARY = "Documentation for texlive-pst-sigsys"
DESCRIPTION = "This package includes the documentation for texlive-pst-sigsys"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn21667"

RPM_NAME = "texlive-pst-sigsys-doc-2026.226.1.4svn21667-60.4.noarch.rpm"
RPM_HASH = "f5526547abdba7e28704d2e5a9cdc30b089265432a0b1cb7effcbc6ce1a3d3a2980d0773b46adbf30361d863c3227c9238439fc4d31ddc57d28a9a1be64d6506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-sigsys-doc"

RDEPENDS:${PN} += ""

inherit rpm
