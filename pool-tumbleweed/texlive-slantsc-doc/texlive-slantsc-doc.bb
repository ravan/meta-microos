SUMMARY = "Documentation for texlive-slantsc"
DESCRIPTION = "This package includes the documentation for texlive-slantsc"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.11svn77682"

RPM_NAME = "texlive-slantsc-doc-2026.226.2.11svn77682-64.2.noarch.rpm"
RPM_HASH = "fde37c9ac549369745ddf48eea2a6722b16d3f78ceae8b7f741de3beb81a5433a418b2053c59231f1f836c6705da02a06dcb630421ca35db2ef9d8c12b1b19ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-slantsc-doc"

RDEPENDS:${PN} += ""

inherit rpm
