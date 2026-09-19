SUMMARY = "LaTeX thesis template for Nanjing University"
DESCRIPTION = "The njuthesis class is intended for typesetting Nanjing \
University dissertations with LaTeX, providing support for \
bachelor, master, and doctoral theses as well as postdoctoral \
reports. Compilation of this class requires either XeLaTeX or \
LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.3svn76924"

RPM_NAME = "texlive-njuthesis-2026.226.1.4.3svn76924-61.2.noarch.rpm"
RPM_HASH = "f7eb8a5be0e0ca8f1b16993aa765f3268bf6024c6283e1522a7b4cfff70c1b4acb437770e31ab8ed27b516526d9e505876e5734225375204bcb19fd392b6bbfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-njuthesis-doc.cls \
tex-njuthesis-graduate.def \
tex-njuthesis-postdoctoral.def \
tex-njuthesis-undergraduate.def \
tex-njuthesis.cls \
texlive-njuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-biblatex.sty \
tex-circledtext.sty \
tex-emptypage.sty \
tex-hyperref.sty \
tex-l3keys2e.sty \
tex-lua-ul.sty \
tex-njuvisual.sty \
tex-pifont.sty \
tex-tabularray.sty \
tex-unicode-math.sty \
tex-xeCJKfntef.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
