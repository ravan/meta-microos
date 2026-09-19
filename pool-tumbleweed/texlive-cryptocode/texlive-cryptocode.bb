SUMMARY = "Typesetting pseudocode, protocols, game-based proofs and black-box reductions in cryptography"
DESCRIPTION = "The cryptocode package provides a set of macros to ease the \
typesetting of pseudocode, algorithms and protocols. In \
addition it comes with a wide range of tools to typeset \
cryptographic papers. This includes simple predefined commands \
for concepts such as a security parameter or advantage terms \
but also flexible and powerful environments to layout \
game-based proofs or black-box reductions."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.44svn60249"

RPM_NAME = "texlive-cryptocode-2026.226.0.0.44svn60249-61.2.noarch.rpm"
RPM_HASH = "5ed80c5bf6cbf6602cab5f5a9671d18b05ed88cf7a295a8a53855e6d8da3291f3a05f4176da8f90edb00f083309ec3ae01c9a961239bc007c7bc2ba6335a2ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cryptocode-2018-11-11.sty \
tex-cryptocode-2020-04-24.sty \
tex-cryptocode.sty \
texlive-cryptocode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-array.sty \
tex-calc.sty \
tex-centernot.sty \
tex-environ.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-forloop.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-pbox.sty \
tex-pgf.sty \
tex-suffix.sty \
tex-tikz.sty \
tex-varwidth.sty \
tex-xargs.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
