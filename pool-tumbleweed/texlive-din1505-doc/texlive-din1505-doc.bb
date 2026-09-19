SUMMARY = "Documentation for texlive-din1505"
DESCRIPTION = "This package includes the documentation for texlive-din1505"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-din1505-doc-2026.226.svn76790-59.2.noarch.rpm"
RPM_HASH = "746a794a798109c8128be7da178e0f00308c23c6cfcfad442e888f008e4803bf850f14f6cf4b736fc7500c463d4a11594f6c7cbdf6d3e6d5633363b2218324ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-din1505-doc"

RDEPENDS:${PN} += ""

inherit rpm
