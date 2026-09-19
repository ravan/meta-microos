SUMMARY = "Documentation for texlive-lua-alt-getopt"
DESCRIPTION = "This package includes the documentation for texlive-lua-alt-getopt"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.0svn56414"

RPM_NAME = "texlive-lua-alt-getopt-doc-2026.226.0.0.7.0svn56414-59.2.noarch.rpm"
RPM_HASH = "bbe2a018c11c7d0808ce9690f91113776eb506f741f2a69faf7c128880cb05adacbd34c90dc07f6a5e9443cecf68248053691b99c8d5dddc2970b1a534c16a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-alt-getopt-doc"

RDEPENDS:${PN} += "/usr/bin/lua \
/usr/bin/sh"

inherit rpm
