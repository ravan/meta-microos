SUMMARY = "Fragments of LaTeX code"
DESCRIPTION = "A collection of fragments of LaTeX code, suitable for inclusion \
in packages, or (possibly) in users' documents. Included are: \
checklab, for modifying the label checking code at \
\\end{document}; overrightarrow, defining a doubled over-arrow \
macro; removefr, for removing 'reset' relations between \
counters; and subscript, defining a \\textsubscript command."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-fragments-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "65cf0c98533dffdc1160297dc5459ecf521910d773f379897ae91d8c3712fc40693413424efb47d7e57e098444586df585128de414aa34930a3961fd6e40fc7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-checklab.tex \
tex-overrightarrow.sty \
tex-removefr.tex \
tex-subscript.sty \
texlive-fragments"

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
