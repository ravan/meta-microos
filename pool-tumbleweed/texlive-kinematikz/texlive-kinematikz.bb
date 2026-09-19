SUMMARY = "Design kinematic chains and mechanisms"
DESCRIPTION = "This package provides functionalities to draw kinematic \
diagrams for mechanisms using dedicate symbols (some from the \
ISO standard and others). The intention is not to represent CAD \
mechanical drawings of mechanisms and robots, but only to \
represent 2D and 3D kinematic chains. The package provides \
links, joints and other symbols, mostly in the form of TikZ pic \
objects. These pics can be placed in the canvas either by a \
central point for joints, and start and end points for some \
links."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn61392"

RPM_NAME = "texlive-kinematikz-2026.226.1.0svn61392-63.2.noarch.rpm"
RPM_HASH = "49097793b7ed2ec848a5a81904de045c186db0db83157942d16f39666c6ed0498bc55c3adfb777b42c8b2b2c016c5dfb633c129e9e6fb9c964563b0825469d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kinematikz.sty \
texlive-kinematikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifthen.sty \
tex-listofitems.sty \
tex-tikz-3dplot.sty \
tex-tikz.sty \
tex-xpatch.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
