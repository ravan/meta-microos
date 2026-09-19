SUMMARY = "Quickly typeset board states of Puyo Puyo games"
DESCRIPTION = "This LaTeX package permits to quickly typeset board states of \
Puyo Puyo games. It supports large and small boards with \
arbitrary shape, hidden rows, current and next puyos, labels \
and move planning markers. The package requires Python3 in \
support of scripts driven by PythonTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn57254"

RPM_NAME = "texlive-puyotikz-2026.226.1.0.1svn57254-60.4.noarch.rpm"
RPM_HASH = "e66df7d86c8d7c8179f17d4ec6f487d4d916330cc14474e401d293a3e057b539a3de46362f98e2856e41e77f24fac57e104975c5936e15c369977dc75c93ee66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-puyotikz.sty \
texlive-puyotikz"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-pythontex.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
