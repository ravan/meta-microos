SUMMARY = "Drawing tic-tac-toe or Noughts and Crosses games"
DESCRIPTION = "This package which provides commands for drawing grids for the \
game known variously as tic-tac-toe (and variants), Noughts and \
Crosses, Naughts and Crosses, Xs and Os, and so on."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn75712"

RPM_NAME = "texlive-tictactoe-2026.227.1.0svn75712-62.2.noarch.rpm"
RPM_HASH = "04279af08732f5ddcef0f0907ade62f73d10956f84510e6c6d31bf439389ede786829c7c79fc9852fc45808baec057958cca89621b0f6477b1d6fbc4867513e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tictactoe.sty \
texlive-tictactoe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
