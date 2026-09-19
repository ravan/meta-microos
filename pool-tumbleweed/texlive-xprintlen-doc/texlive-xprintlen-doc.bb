SUMMARY = "Documentation for texlive-xprintlen"
DESCRIPTION = "This package includes the documentation for texlive-xprintlen"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35928"

RPM_NAME = "texlive-xprintlen-doc-2026.226.1.0svn35928-59.4.noarch.rpm"
RPM_HASH = "d2d70dd3d6657e37c2bf02db2ae3daf9a46131c8981c658207c7d43ea0adff255acb4be02e23e35b1c43ec4028df2aab517afc7d12399eaff01069ebc1b24c65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xprintlen-doc"

RDEPENDS:${PN} += ""

inherit rpm
