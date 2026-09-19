SUMMARY = "Unicode mathematics support for XeTeX and LuaTeX"
DESCRIPTION = "This package provides a comprehensive implementation of unicode \
maths for XeLaTeX and LuaLaTeX. Unicode maths requires an \
OpenType mathematics font, of which there are now a number \
available via CTAN. While backwards compatibility is strived \
for, there are some differences between the legacy mathematical \
definitions in LaTeX and amsmath, and the Unicode mathematics \
definitions. Care should be taken when transitioning from a \
legacy workflow to a Unicode-based one."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8rsvn77682"

RPM_NAME = "texlive-unicode-math-2026.226.0.0.8rsvn77682-60.2.noarch.rpm"
RPM_HASH = "343fecc0df16dbe35762928f5d3ed8154134da7f06a4cb49d7b46fe17fa03687031f43827ecdb59f0c01df762e699d128ce7fe71ad05a6d84475867e18f6ccc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unicode-math-luatex.sty \
tex-unicode-math-table.tex \
tex-unicode-math-xetex.sty \
tex-unicode-math.sty \
texlive-unicode-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-fix-cm.sty \
tex-fontspec.sty \
tex-l3keys2e.sty \
tex-lualatex-math.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-fontspec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lm-math \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
