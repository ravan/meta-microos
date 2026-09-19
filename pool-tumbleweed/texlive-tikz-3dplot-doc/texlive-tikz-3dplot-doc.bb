SUMMARY = "Documentation for texlive-tikz-3dplot"
DESCRIPTION = "This package includes the documentation for texlive-tikz-3dplot"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn25087"

RPM_NAME = "texlive-tikz-3dplot-doc-2026.227.svn25087-62.2.noarch.rpm"
RPM_HASH = "5a3f1ab052e45b35dd4fb2bf357e14794c2e505ac775cf225c76f8768070b85f2064999dccc1a111b3419f67b247188fc63833f550234d67937ddf9da6e4b2b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-3dplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
