SUMMARY = "Documentation for texlive-dccpaper"
DESCRIPTION = "This package includes the documentation for texlive-dccpaper"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn75491"

RPM_NAME = "texlive-dccpaper-doc-2026.226.2.6svn75491-59.2.noarch.rpm"
RPM_HASH = "dae13838a6b623792cb5b8d9b6cc41f7139b5ddb934cbdc5d0033a0a7c046da98ca4ea0556a4da68ac345637c9e88799ecc0ccedc784fd5bef1bd5244a24c7d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dccpaper-doc"

RDEPENDS:${PN} += ""

inherit rpm
