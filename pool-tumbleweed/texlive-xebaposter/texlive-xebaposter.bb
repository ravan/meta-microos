SUMMARY = "Create beautiful scientific Persian/Latin posters using TikZ"
DESCRIPTION = "This package is designed for making beautiful scientific \
Persian/Latin posters. It is a fork of baposter by Brian Amberg \
and Reinhold Kainhofer available at LaTeX Poster Template. \
baposter's users should be able to compile their poster using \
xebaposter (instead of baposter) without any problem."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.54svn75290"

RPM_NAME = "texlive-xebaposter-2026.226.2.54svn75290-59.4.noarch.rpm"
RPM_HASH = "f12c84856567cfe90cc84f4319db0b08715fa49d7b4e9377a52c108da077820f6adeb199add6b563c9faabb6f5de8a47ebe858d07f7762cf26f5eb87377e1c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xebaposter.cls \
texlive-xebaposter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-pgf.sty \
tex-pgfpages.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
