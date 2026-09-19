SUMMARY = "Documentation for texlive-proof-at-the-end"
DESCRIPTION = "This package includes the documentation for texlive-proof-at-the-end"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77355"

RPM_NAME = "texlive-proof-at-the-end-doc-2026.226.svn77355-59.2.noarch.rpm"
RPM_HASH = "b74f7f7cfcf2cc62d7f7eb1d2b8d76d388c39627de7c4e2ca53e56ec17a5fe6f4b6df49d4e9c767a3d56a11da72ea1a45497bc49cfe2a6adda4ef649262c254f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proof-at-the-end-doc"

RDEPENDS:${PN} += ""

inherit rpm
