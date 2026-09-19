SUMMARY = "LaTeX style for typesetting strategic games"
DESCRIPTION = "Formats strategic games. For a 2x2 game, for example, the \
input: \\begin{game}{2}{2} &$L$ &$M$\\\\ $T$ &$2,2$ &$2,0$\\\\ $B$ \
&$3,0$ &$0,9$ \\end{game} produces output with (a) boxes around \
the payoffs, (b) payoff columns of equal width, and (c) payoffs \
vertically centered within the boxes. Note that the game \
environment will not work in the argument of another command."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.15svn30959"

RPM_NAME = "texlive-sgame-2026.226.2.15svn30959-60.2.noarch.rpm"
RPM_HASH = "4622a8a989a67b623438c431ce865df1d7b950b3196a22d8293820d1d310c2e1fdffd1bf5624970485f2041d7fbb7e2e5600b505ae2b7877277f8137d558c2aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sgame.sty \
tex-sgamevar.sty \
texlive-sgame"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
