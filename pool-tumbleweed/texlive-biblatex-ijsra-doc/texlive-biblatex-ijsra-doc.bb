SUMMARY = "Documentation for texlive-biblatex-ijsra"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-ijsra"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76790"

RPM_NAME = "texlive-biblatex-ijsra-doc-2026.226.0.0.1svn76790-61.2.noarch.rpm"
RPM_HASH = "b2b86eb9bb59065ffc8333be422754dab0606455e7a6720b7f8a171988314d12b3cc7adbe4f9abfa301a9df757467b28447b0a454d110520c5c25fb8eab16d35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-ijsra-doc"

RDEPENDS:${PN} += ""

inherit rpm
