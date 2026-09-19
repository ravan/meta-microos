SUMMARY = "Documentation for texlive-yplan"
DESCRIPTION = "This package includes the documentation for texlive-yplan"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn34398"

RPM_NAME = "texlive-yplan-doc-2026.226.svn34398-59.4.noarch.rpm"
RPM_HASH = "bcf472cbb4ac1e0db7af17548d2c32e2c3ac6e62238429c27c302bffa520ef07eca0a6ca7073eea33ad1dc1c6627264d7b07f5cac320e8dd4de9cc74a447cfca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yplan-doc"

RDEPENDS:${PN} += ""

inherit rpm
