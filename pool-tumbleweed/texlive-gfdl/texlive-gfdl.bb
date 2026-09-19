SUMMARY = "Support for using GNU Free Documentation License in LaTeX"
DESCRIPTION = "The GFDL (GNU Free Documentation License) is a popular license \
used for programming manuals, documentations and various other \
textual works too, but using this license with LaTeX is not \
very convenient. This package aims to help users in easily \
using the license without violating any rules of the license. \
With a handful of commands, users can rest assured that their \
document will be perfectly licensed under GFDL."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2svn75712"

RPM_NAME = "texlive-gfdl-2026.226.0.0.2svn75712-60.2.noarch.rpm"
RPM_HASH = "0750961732ecc6e39f37896e1fb5ade04ba93411dc74c2989a3cc9a98112a9669a3792d78c9f44b169ca33f2d5070409915ab3e0ba0f1cd2373749f2b940c081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gfdl-tex-1p1.tex \
tex-gfdl-tex-1p2.tex \
tex-gfdl-tex-1p3.tex \
tex-gfdl.sty \
texlive-gfdl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-csquotes.sty \
tex-expkv-def.sty \
tex-expkv-opt.sty \
tex-float.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
