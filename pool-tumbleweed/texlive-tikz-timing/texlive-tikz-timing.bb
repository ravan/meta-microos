SUMMARY = "Easy generation of timing diagrams as TikZ pictures"
DESCRIPTION = "This package provides macros and an environment to generate \
timing diagrams (digital waveforms) without much effort. The \
TikZ package is used to produce the graphics. The diagrams may \
be inserted into text (paragraphs, \\hbox, etc.) and into \
tikzpictures. A tabular-like environment is provided to produce \
larger timing diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7fsvn64967"

RPM_NAME = "texlive-tikz-timing-2026.226.0.0.7fsvn64967-59.2.noarch.rpm"
RPM_HASH = "229ed0c6beb674add4857be172b2b20fc685521afb9814332823bc4027bffcf4ee6c9c89f675d4da6bf0a997881cecea46170e2dd5a37359f27915c952883e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-timing-advnodes.sty \
tex-tikz-timing-arrows.sty \
tex-tikz-timing-beamer.sty \
tex-tikz-timing-clockarrows.sty \
tex-tikz-timing-columntype.sty \
tex-tikz-timing-counters.sty \
tex-tikz-timing-either.sty \
tex-tikz-timing-ifsym.sty \
tex-tikz-timing-interval.sty \
tex-tikz-timing-nicetabs.sty \
tex-tikz-timing-overlays.sty \
tex-tikz-timing.sty \
texlive-tikz-timing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-booktabs.sty \
tex-environ.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-svn-prov"

inherit rpm
