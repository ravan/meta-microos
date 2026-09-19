SUMMARY = "Documentation for texlive-tableaux"
DESCRIPTION = "This package includes the documentation for texlive-tableaux"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn42413"

RPM_NAME = "texlive-tableaux-doc-2026.226.svn42413-64.2.noarch.rpm"
RPM_HASH = "ea134ef8c66bca00deb15ea764cc70eef21367304721ca35f0ccbde2f2e04fe2189d17aa70728357db9ca405c5e513f6b7538a5f334bc3b64fb163b18b1ee1e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tableaux-doc-fr \
texlive-tableaux-doc"

RDEPENDS:${PN} += ""

inherit rpm
