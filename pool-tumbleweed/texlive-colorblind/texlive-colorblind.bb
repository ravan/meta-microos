SUMMARY = "Easy colorblind-safe typesetting"
DESCRIPTION = "In colorblind-safe documents, the contents are presented in a \
way that the same information is conveyed to readers regardless \
of a potential color vision deficiency. This package provides \
the tools necessary for colorblind-safe typesetting in LaTeX. \
It provides color schemes for a wide range of applications. The \
most commonly used schemes are qualitative schemes, providing \
easily distinguishable colors for use in graphics, but also for \
text coloring or highlighting. Additionally, diverging and \
sequential schemes are included which can be used for encoding \
quantitative information using colors. This package \
incorporates colorblind-safeness into the writing process, \
making it both less cumbersome and less error-prone."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn77410"

RPM_NAME = "texlive-colorblind-2026.226.1.2.1svn77410-60.2.noarch.rpm"
RPM_HASH = "ed90617f9ed5b1993ad9ffe99703165a1b62c60c883401f6621c8d1b003c07b4946d28dfff83fc15ad9aff0da25a03e9a26e8ed602fb35365fc210061352206d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colorblind.sty \
texlive-colorblind"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgfplots.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
