SUMMARY = "Put LaTeX material over included graphics"
DESCRIPTION = "The package defines a convenient interface to put any LaTeX \
material on top of included graphics. The LaTeX material may \
also be rotated and typeset on top of a white box overshadowing \
the graphics. The coordinates of the LaTeX boxes are given \
relative to the original, unscaled graphics; when the graphics \
is rescaled, the LaTeX annotations stay at their right places \
(unless you do something extreme). In a draft mode, the package \
enables you to draw a coordinate grid over the picture for easy \
adjustment of positions of the annotations."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn20843"

RPM_NAME = "texlive-lpic-2026.226.0.0.8svn20843-61.2.noarch.rpm"
RPM_HASH = "e141e0ae03c0998dc12717882668c3fc45012ec71e110052275204bd8808becbed6395c295a04fd967750c9f18be50c2e85be742b950db738a2848947ab2fe95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lpic.sty \
texlive-lpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-epsfig.sty \
tex-ifthen.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
