SUMMARY = "Medium scheme (small + more packages and languages)"
DESCRIPTION = "This is the medium TeX Live collection: it contains plain TeX, \
LaTeX, many recommended packages, and support for most European \
languages."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn54074"

RPM_NAME = "texlive-scheme-medium-2026.222.svn54074-68.2.noarch.rpm"
RPM_HASH = "e52113013173fc964181f27dae924132db379b4de785abf0eb6d840266b0bbdda7e6008e5a830a6f0c70a5bbd3f6abca9f85f1ba1d86e7470ae643ed30755192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-medium \
texlive-scheme-medium"

RDEPENDS:${PN} += "texlive-collection-basic \
texlive-collection-binextra \
texlive-collection-context \
texlive-collection-fontsrecommended \
texlive-collection-fontutils \
texlive-collection-langczechslovak \
texlive-collection-langenglish \
texlive-collection-langeuropean \
texlive-collection-langfrench \
texlive-collection-langgerman \
texlive-collection-langitalian \
texlive-collection-langpolish \
texlive-collection-langportuguese \
texlive-collection-langspanish \
texlive-collection-latex \
texlive-collection-latexrecommended \
texlive-collection-luatex \
texlive-collection-mathscience \
texlive-collection-metapost \
texlive-collection-plaingeneric \
texlive-collection-xetex"

inherit rpm
