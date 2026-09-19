SUMMARY = "Full scheme (everything)"
DESCRIPTION = "This is the full TeX Live scheme: it installs everything \
available."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn54074"

RPM_NAME = "texlive-scheme-full-2026.222.svn54074-68.2.noarch.rpm"
RPM_HASH = "7a11e682daee4e59521b86ead47b4cb5d14260f38624558507471d7732cecec4d270a6f6865a113ccc52c5b32801174b1c97864354c72f518ef221dd8f6d17c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-full \
texlive-scheme-full"

RDEPENDS:${PN} += "texlive-collection-basic \
texlive-collection-bibtexextra \
texlive-collection-binextra \
texlive-collection-context \
texlive-collection-fontsextra \
texlive-collection-fontsrecommended \
texlive-collection-fontutils \
texlive-collection-formatsextra \
texlive-collection-games \
texlive-collection-humanities \
texlive-collection-langarabic \
texlive-collection-langchinese \
texlive-collection-langcjk \
texlive-collection-langcyrillic \
texlive-collection-langczechslovak \
texlive-collection-langenglish \
texlive-collection-langeuropean \
texlive-collection-langfrench \
texlive-collection-langgerman \
texlive-collection-langgreek \
texlive-collection-langitalian \
texlive-collection-langjapanese \
texlive-collection-langkorean \
texlive-collection-langother \
texlive-collection-langpolish \
texlive-collection-langportuguese \
texlive-collection-langspanish \
texlive-collection-latex \
texlive-collection-latexextra \
texlive-collection-latexrecommended \
texlive-collection-luatex \
texlive-collection-mathscience \
texlive-collection-metapost \
texlive-collection-music \
texlive-collection-pictures \
texlive-collection-plaingeneric \
texlive-collection-pstricks \
texlive-collection-publishers \
texlive-collection-xetex"

inherit rpm
