SUMMARY = "Controlling captions, fullpage and doublepage floats"
DESCRIPTION = "This package defines a macro to place objects (tables and \
figures) and their captions in different positions with \
different rotating angles within a float. All objects and \
captions can be framed. The main command is \\hvFloat{float \
type}{floating object}{caption}{label}; a simple example is \
\\hvFloat{figure}{\\includegraphics{rose}}{Caption}{fig:0}. \
Options are provided to place captions to the right or left, \
and rotated. Setting nonFloat=true results in placing the float \
here."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.56svn77682"

RPM_NAME = "texlive-hvfloat-2026.226.2.56svn77682-60.2.noarch.rpm"
RPM_HASH = "76efaf6c27909574eba48fa879c886e92a0abdc382c53c64272311a7e23d1a7d8842d871207570dfbc6e3c1ed30ac5af19300ea4ccd8caf8c6c8c58751ea7bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvfloat-fps.sty \
tex-hvfloat.sty \
texlive-hvfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-atbegshi.sty \
tex-caption.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fbox.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifoddpage.sty \
tex-marginnote.sty \
tex-multido.sty \
tex-picture.sty \
tex-stfloats.sty \
tex-subcaption.sty \
tex-trimclip.sty \
tex-varwidth.sty \
tex-xkeyval.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
