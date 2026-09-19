SUMMARY = "Flexible and complete interface to document dimensions"
DESCRIPTION = "The package provides an easy and flexible user interface to \
customize page layout, implementing auto-centering and \
auto-balancing mechanisms so that the users have only to give \
the least description for the page layout. For example, if you \
want to set each margin 2cm without header space, what you need \
is just \\usepackage[margin=2cm,nohead]{geometry}. The package \
knows about all the standard paper sizes, so that the user need \
not know what the nominal 'real' dimensions of the paper are, \
just its standard name (such as a4, letter, etc.). An important \
feature is the package's ability to communicate the paper size \
it's set up to the output (whether via DVI \\specials or via \
direct interaction with pdf(La)TeX)."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.9svn77682"

RPM_NAME = "texlive-geometry-2026.226.5.9svn77682-60.2.noarch.rpm"
RPM_HASH = "d821b831f1062bf6eb2921536867f1a6223f45f6e1bc0665e3877bac9831ae63683896ee645626a2095de9a77849a9be598c6ed0663ec4e3fb992e94c11822de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-geometry.sty \
texlive-geometry"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-ifvtex.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-graphics \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
