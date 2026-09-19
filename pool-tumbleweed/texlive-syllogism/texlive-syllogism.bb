SUMMARY = "Typeset syllogisms in LaTeX"
DESCRIPTION = "The package provides a simple, configurable, way for neatly \
typesetting syllogisms and syllogistic-like arguments, composed \
of two premises and a conclusion."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-syllogism-2026.226.1.2svn15878-64.2.noarch.rpm"
RPM_HASH = "2738bdbf64dde8d89b99344ca601aaca8a53b42e67afdfa29363fefbd5b3a0c1a5340d04468054e82a4793a668321058a0802d8a9f5dd7b0b07ed9187083812f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-syllogism.sty \
texlive-syllogism"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
