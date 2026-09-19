SUMMARY = "Typeset and cross-reference chemical schemes based on TikZ code"
DESCRIPTION = "The package provides a comfortable means of typesetting \
chemical schemes, and also offers automatic structure \
referencing."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn46723"

RPM_NAME = "texlive-chemschemex-2026.226.1.2svn46723-60.2.noarch.rpm"
RPM_HASH = "d4ed9182c8344a44485bfca059115c7d582b31f4e99a60162e545fe8225c5844c81e8aeed4372157621da026d5f886c9b56bd9d355e9336f841d816df5563787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemschemex.sty \
texlive-chemschemex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fancylabel.sty \
tex-graphicx.sty \
tex-suffix.sty \
tex-tikz.sty \
tex-xargs.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
