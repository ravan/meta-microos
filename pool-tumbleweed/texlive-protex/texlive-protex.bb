SUMMARY = "Literate programming package"
DESCRIPTION = "ProTeX is a simple but powerful literate programming tool, \
which is designed to generate useful hypertext output (either \
PDF, or HTML using TeX4ht)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn41633"

RPM_NAME = "texlive-protex-2026.226.svn41633-59.2.noarch.rpm"
RPM_HASH = "7fb5539b8e776f2cd6f1e03b2740ed3aa97cbdc3ab102e9e93c88d956e09185478f8e5ad27fd490c56c5e18e0cabb03a0f49858acb07c7b6405a94215ff228d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AlProTex.sty \
tex-ProTex.sty \
texlive-protex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
