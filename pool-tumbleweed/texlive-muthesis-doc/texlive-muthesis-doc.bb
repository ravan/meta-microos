SUMMARY = "Documentation for texlive-muthesis"
DESCRIPTION = "This package includes the documentation for texlive-muthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23861"

RPM_NAME = "texlive-muthesis-doc-2026.226.svn23861-61.2.noarch.rpm"
RPM_HASH = "3ff9c9f7710219917f3f6270ba7326f9eca7e47e94ac2f6af8b8ea63ff2854835b02fc76be5d14513bcd68473a63c9a59e9f9603e235e81283f716bbf8cdf113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-muthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
