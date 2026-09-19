SUMMARY = "OpenType version of Hermann Zapf's Euler maths font"
DESCRIPTION = "Euler-Math.otf (formerly named 'Neo-Euler.otf') is an OpenType \
version of Hermann Zapf's Euler maths font. It is the \
continuation of the Euler project initiated by Khaled Hosny in \
2009 and abandoned in 2016. A style file euler-math.sty is \
provided as a replacement of the eulervm package for LuaLaTeX \
and XeLaTeX users."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.75svn77952"

RPM_NAME = "texlive-euler-math-2026.226.0.0.75svn77952-59.2.noarch.rpm"
RPM_HASH = "674ca1e4a6d1ebae01515843819ae3b003141bfa20b95daa0a3234d798375ab138d3d618bcc7f5619a92031e0fc020ecf46e8fff360a89f101def3d973534e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euler-math.sty \
tex-neo-euler.sty \
texlive-euler-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-unicode-math.sty \
texlive \
texlive-euler-math-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
