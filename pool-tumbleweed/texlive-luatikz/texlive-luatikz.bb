SUMMARY = "A 2D graphics library to draw TikZ graphics using the Lua programming language"
DESCRIPTION = "This package provides a comfort graphics library to work with \
graphic objects as immutables in the Lua programming language. \
It writes code for the TikZ package. It overloads operators, so \
you can use standard math expressions to work with graphical \
objects. There probably isn't anything that couldn't been done \
just as well with pgfmath and TikZ directly. However, if a \
graphic gets more complicated, Lua may just be easier to work \
with as base."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.12.0svn73087"

RPM_NAME = "texlive-luatikz-2026.226.2.12.0svn73087-59.2.noarch.rpm"
RPM_HASH = "18dba1789968ad5ddef9c5ff9539fe4beaf2bf3b2e11048e9d0d0aa9c89eebc1fbc3ceb8c4904b1d223ca7889eeb952fb9cb2dcd44913efd4890717bdd19c591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatikz.sty \
texlive-luatikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luacode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
