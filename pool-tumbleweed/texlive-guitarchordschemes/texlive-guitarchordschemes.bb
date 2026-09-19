SUMMARY = "Guitar Chord and Scale Tablatures"
DESCRIPTION = "This package provides two commands (\\chordscheme and \\scales). \
With those commands it is possible to draw schematic diagrams \
of guitar chord tablatures and scale tablatures. Both commands \
know a range of options that allow wide customization of the \
output. The package's drawing is done with the help of TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn54512"

RPM_NAME = "texlive-guitarchordschemes-2026.226.0.0.7svn54512-60.4.noarch.rpm"
RPM_HASH = "12a90a4334152ec4388e98d505f5186f319811db0653d6a242ae229ac84d87f1d79276d750f057aff54d8b8be1a2793e876855f1ad561947e608cd685c578a97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-guitarchordschemes.sty \
texlive-guitarchordschemes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cnltx-base.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
