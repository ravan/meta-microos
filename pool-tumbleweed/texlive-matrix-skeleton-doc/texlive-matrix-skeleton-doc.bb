SUMMARY = "Documentation for texlive-matrix-skeleton"
DESCRIPTION = "This package includes the documentation for texlive-matrix-skeleton"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn65013"

RPM_NAME = "texlive-matrix-skeleton-doc-2026.226.1.1svn65013-59.2.noarch.rpm"
RPM_HASH = "ec4fdf4faad37976b8ed8f9a2f8d3b2ddfc1b5345bab7cae5d30f66cdc327af6edd1cf4762c50f9a81c59e9acb9e4e3799ed7b73af12c1c6e9ca9f5ea85d9755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-matrix-skeleton-doc"

RDEPENDS:${PN} += ""

inherit rpm
