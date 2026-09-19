SUMMARY = "Feynman diagrams with TikZ"
DESCRIPTION = "This package lets you draw Feynman diagrams using TikZ. It is a \
low-end modification of the TikZ-Feynman package, one of whose \
principal advantages is the automatic generation of diagrams, \
for which it needs LuaTeX. TikZ-FeynHand only provides the \
manual mode and hence runs in LaTeX without any reference to \
LuaTeX. In addition it provides some new styles for vertices \
and propagators, alternative shorter keywords in addition to \
TikZ-Feynman's longer ones, some shortcut commands for quickly \
customizing the diagrams' look, and the new feature of putting \
one propagator 'on top' of another. It also includes a quick \
user guide for getting started, with many examples and a \
5-minute introduction to TikZ."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.0svn76924"

RPM_NAME = "texlive-tikz-feynhand-2026.226.1.1.0svn76924-59.2.noarch.rpm"
RPM_HASH = "10cfbb5d5fb292ab7bb353e8102c6c1d7638550e80b7bcc4e918108d1f70c2b21899bca0f867e63c8ae86b1d61bf9f3436a96c510068e191d7650b3fe123de79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-feynhand.sty \
tex-tikzfeynhand.keys.code.tex \
tex-tikzlibraryfeynhand.code.tex \
texlive-tikz-feynhand"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
