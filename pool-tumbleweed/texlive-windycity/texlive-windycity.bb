SUMMARY = "A Chicago style for BibLaTeX"
DESCRIPTION = "Windy City is a style for BibLaTeX that formats notes, \
bibliographies, parenthetical citations, and reference lists \
according to the 17th edition of The Chicago Manual of Style."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn67011"

RPM_NAME = "texlive-windycity-2026.226.svn67011-60.2.noarch.rpm"
RPM_HASH = "c3124457a82bccdc80c428e3adbe0ea89b6b43a09ac7045bf90e492521197bdbe6a3d5105a30dc5cfc97e1399c618758ebdbf765b3c3d77f2864a7f9181cc5be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-american-windycity.lbx \
tex-windycity.bbx \
tex-windycity.cbx \
tex-windycity.sty \
texlive-windycity"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-american.lbx \
tex-babel.sty \
tex-biblatex.sty \
tex-booktabs.sty \
tex-btxdockit.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-helvet.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-pifont.sty \
tex-ragged2e.sty \
tex-textcomp.sty \
tex-tgtermes.sty \
tex-titlesec.sty \
tex-tocloft.sty \
tex-xltxtra.sty \
tex-xunicode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
