SUMMARY = "Documentation for texlive-cd-cover"
DESCRIPTION = "This package includes the documentation for texlive-cd-cover"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn17121"

RPM_NAME = "texlive-cd-cover-doc-2026.226.1.0svn17121-59.2.noarch.rpm"
RPM_HASH = "05a6fb90c9d0e6a0e6af09390c358e9cc77b3c6d3ec81d12a97a3f1baaa85c2a907d3324d946776f1008f1cd348ea1930e454998b10f5ae79bb833631d57842c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cd-cover-doc"

RDEPENDS:${PN} += ""

inherit rpm
