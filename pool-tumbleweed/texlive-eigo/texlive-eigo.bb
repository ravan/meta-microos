SUMMARY = "Comprehensive tools for creating Go (Weiqi/Baduk) game diagrams in LaTeX"
DESCRIPTION = "The eigo package provides comprehensive tools for creating Go \
(Weiqi/Baduk) game diagrams in LaTeX documents. Developed with \
AI assistance, it offers multiple stone colors with full RGB \
customization, automatic numbering systems with alternating \
colors, geometric transformations (rotations, mirrors), \
flexible board display options with enhanced 2pt borders for \
publication quality, symbol placement, and full LuaLaTeX \
compatibility. The package supports seven stone colors, border \
display, extended size presets with validation, and advanced \
features for game analysis and problem presentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn78101"

RPM_NAME = "texlive-eigo-2026.226.1svn78101-61.4.noarch.rpm"
RPM_HASH = "17619e7c0de706e08c3869c99a7d3dfe13e2de2e905d614e5da18482c7bfe6cb4aca9a361a559ffc9072195047228f015333c8d8880722c374e34de5c4d27239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eigo.sty \
texlive-eigo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fontenc.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-luatex85.sty \
tex-newunicodechar.sty \
tex-pgffor.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
