SUMMARY = "LuaTeX format based on Plain TeX and OPmac"
DESCRIPTION = "OpTeX is a LuaTeX format based on Plain TeX macros with power \
from OPmac (fonts selection system, colors, external graphics, \
references, hyperlinks, ...) with unicode fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.19svn78109"

RPM_NAME = "texlive-optex-2026.226.1.19svn78109-61.2.noarch.rpm"
RPM_HASH = "a4a5dd782797ee1d807d8ca12b1371e39d22072e3e9b825bddfe7b4daeaeb8282f87b007cf226754d99386488d66c310b2f9f38b62532774bca1c7eac8e83d02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-op-demo.tex \
tex-op-letter-cs.tex \
tex-op-letter-en.tex \
tex-op-letter-he.tex \
tex-op-letter-src.tex \
tex-op-letter-srl.tex \
tex-op-mathalign.tex \
tex-op-slides.tex \
texlive-optex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-amsfonts \
texlive-cm \
texlive-ec \
texlive-filesystem \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-librarian \
texlive-lm \
texlive-luaotfload \
texlive-luatex \
texlive-optex-bin \
texlive-rsfs \
texlive-scripts \
texlive-scripts-bin \
texlive-unicode-data"

inherit rpm
