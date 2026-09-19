SUMMARY = "Extensive maths for LuaTeX"
DESCRIPTION = "This package provides a simple and highly configurable way to \
use Unicode and OpenType mathematics with simple LuaTeX, taking \
advantage of most of the engine's new capabilities in \
mathematical typesetting. Also included are the proper settings \
and definitions for almost all Unicode mathematical characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025_1.5svn73816"

RPM_NAME = "texlive-minim-math-2026.226.2025_1.5svn73816-61.2.noarch.rpm"
RPM_HASH = "7a68b00955390f8a6e4d107a778c8bae6efe00a9610ed94ca35db0dfb093b72eac9a399220a7fef710165e171ba87af24d6e616f7b9ed516f5fcdc629c4c5203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minim-math.tex \
texlive-minim-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
