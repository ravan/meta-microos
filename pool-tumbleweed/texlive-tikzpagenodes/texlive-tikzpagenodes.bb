SUMMARY = "A single TikZ node for the whole page"
DESCRIPTION = "The package provides special PGF/TikZ nodes for the text, \
marginpar, footer and header area of the current page. They are \
inspired by the 'current page' node defined by PGF/TikZ itself."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn64967"

RPM_NAME = "texlive-tikzpagenodes-2026.226.1.1svn64967-59.2.noarch.rpm"
RPM_HASH = "4334f4e67f2f97f070bcfd28d1bf366859484f64006068860a844c60c2520f1de7e9378b34b6a3aa35ac42a7293bcdb2da7373f18bc3b681c36ccbf3b3215370"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzpagenodes.sty \
texlive-tikzpagenodes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifoddpage.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
