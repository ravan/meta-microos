SUMMARY = "Documentation for texlive-stringenc"
DESCRIPTION = "This package includes the documentation for texlive-stringenc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.12svn77682"

RPM_NAME = "texlive-stringenc-doc-2026.226.1.12svn77682-64.2.noarch.rpm"
RPM_HASH = "9de3d0eb0492b1e491967c5be86c858c0cfc6dfdd270dacbba53b8467acd9915f769859af707cc799556d2093e15cbb920ac2a9e5b6292e166bd569e95485af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stringenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
