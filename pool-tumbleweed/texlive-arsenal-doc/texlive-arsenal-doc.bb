SUMMARY = "Documentation for texlive-arsenal"
DESCRIPTION = "This package includes the documentation for texlive-arsenal"
LICENSE = "OFL-1.1"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-arsenal-doc-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "c7ae10c0ef71b9b5f77b4de1eb32c8df6e1751ff1fecb1c03a1968cd2a8cfb1652e32e5a7fe72775b72efb2433b8e7ee9d3fd4344b21991bcdcf047085816ed2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arsenal-doc"

RDEPENDS:${PN} += ""

inherit rpm
