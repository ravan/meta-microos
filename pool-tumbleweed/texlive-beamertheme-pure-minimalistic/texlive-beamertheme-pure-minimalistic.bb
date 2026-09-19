SUMMARY = "A minimalistic presentation theme for LaTeX Beamer"
DESCRIPTION = "The main features of this minimalistic Beamer theme are: Easily \
use own logos. Customizable. Looks good in a 4:3 and 16:9 \
aspect ratio, without the need to change anything. Provides an \
environment for vertically-spaced items. Provides light and \
dark mode. Is designed to be purely minimalistic without any \
distractions."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0.0svn56934"

RPM_NAME = "texlive-beamertheme-pure-minimalistic-2026.226.2.0.0svn56934-61.2.noarch.rpm"
RPM_HASH = "72e32612618c02ebcbab08655a888a27f982366a947b289ab0811b859d29e63e1849015e31c874a3e1d7ec7853b3b4ed993b7dc45d09787fbf6d4ebcb6d7bf87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemepureminimalistic.sty \
tex-beamerfontthemepureminimalistic.sty \
tex-beamerinnerthemepureminimalistic.sty \
tex-beamerouterthemepureminimalistic.sty \
tex-beamerthemepureminimalistic.sty \
texlive-beamertheme-pure-minimalistic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraMono.sty \
tex-FiraSans.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-noto.sty \
tex-silence.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
