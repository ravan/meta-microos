SUMMARY = "Documentation for texlive-europecv"
DESCRIPTION = "This package includes the documentation for texlive-europecv"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75227"

RPM_NAME = "texlive-europecv-doc-2026.226.svn75227-59.2.noarch.rpm"
RPM_HASH = "8b5da79e9d90309299994a205ce035e7402c91d9465141fc65d574598eb581d0a8c84a81a78e5750ea2f37a286ca6bb561e9a75c0e0b5f5ad3537dc6dae216fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-europecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
