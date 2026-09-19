SUMMARY = "Documentation for texlive-shortmathj"
DESCRIPTION = "This package includes the documentation for texlive-shortmathj"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn76790"

RPM_NAME = "texlive-shortmathj-doc-2026.226.0.0.5.0svn76790-60.2.noarch.rpm"
RPM_HASH = "a7daece414f42dab3fa8f34a339dd8e1f0b51a49e55c2322e796b3357db0879cb06ba9611829ef54ea97b3dd6f75e07e6b2e6e4199bccb8fdff21d917c46d8ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shortmathj-doc"

RDEPENDS:${PN} += ""

inherit rpm
