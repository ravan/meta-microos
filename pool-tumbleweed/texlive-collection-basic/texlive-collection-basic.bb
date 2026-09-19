SUMMARY = "Essential programs and files"
DESCRIPTION = "These files are regarded as basic for any TeX system, covering \
plain TeX macros, Computer Modern fonts, and configuration for \
common drivers; no LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn72890"

RPM_NAME = "texlive-collection-basic-2026.222.svn72890-68.2.noarch.rpm"
RPM_HASH = "daa7ea072e51160131edfbb8d2053adba5b4111f806857f2aa3ea130ec81d43b59464e066e72b58eb785a5cbe2107f7404639838f309ddeb000781a444be6637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-basic \
tex-tex \
texlive-collection-basic"

RDEPENDS:${PN} += "texlive-amsfonts \
texlive-bibtex \
texlive-cm \
texlive-colorprofiles \
texlive-dvipdfmx \
texlive-dvips \
texlive-ec \
texlive-enctex \
texlive-etex \
texlive-etex-pkg \
texlive-extractbb \
texlive-glyphlist \
texlive-graphics-def \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-hyphenex \
texlive-ifplatform \
texlive-iftex \
texlive-knuth-lib \
texlive-knuth-local \
texlive-kpathsea \
texlive-lua-alt-getopt \
texlive-luahbtex \
texlive-luatex \
texlive-makeindex \
texlive-metafont \
texlive-mflogo \
texlive-mfware \
texlive-modes \
texlive-pdftex \
texlive-plain \
texlive-scripts \
texlive-tex \
texlive-tex-ini-files \
texlive-texlive-common \
texlive-texlive-en \
texlive-texlive.infra \
texlive-unicode-data \
texlive-xdvi"

inherit rpm
