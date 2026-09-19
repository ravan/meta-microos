SUMMARY = "A modern LaTeX poster theme"
DESCRIPTION = "This class extends the a0poster class in that it adds support \
to easily create posters without the need for taking care of \
the layout at all. It allows to use \\maketitle to generate a \
fancy header containing the title information and also provides \
macros to position various different types of text boxes in a \
two-column layout. The color scheme is inspired by the \
metropolis beamer theme."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03.1svn47269"

RPM_NAME = "texlive-modernposter-2026.226.1.03.1svn47269-61.2.noarch.rpm"
RPM_HASH = "00d8557d800383982b9f9d14fefc9a49439d4dacdb9d1789b9e56225c3f6dabc11185f09f7a03d81ffcbade6e65a23f85dc1859a9ac77c9f74ec681b3e7a97ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modernposter.cls \
texlive-modernposter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-FiraSans.sty \
tex-a0poster.cls \
tex-enumitem.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-fontawesome.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-relsize.sty \
tex-sfmath.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
