SUMMARY = "The LuaTeX engine"
DESCRIPTION = "LuaTeX is a greatly extended version of pdfTeX using Lua as an \
embedded scripting language. The LuaTeX project's main \
objective is to provide an open and configurable variant of TeX \
while at the same time offering substantive backward \
compatibility. LuaTeX uses Unicode (as UTF-8) as its default \
input encoding, and is able to use modern (OpenType and \
TrueType) fonts (for both text and mathematics)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn78218"

RPM_NAME = "texlive-luatex-2026.226.svn78218-59.2.noarch.rpm"
RPM_HASH = "6aaadc1d75bfd26520faea69c9b452cbe1c5412252da6f7ef09091a59164ab644aca4b9a85ff3fe985519e6007528d74351ff1f6610958ed626de52f702e496c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luatex-unicode-letters.tex \
texlive-luatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-load-unicode-data.tex \
tex-luatexconfig.tex \
tex-null.tex \
texlive \
texlive-cm \
texlive-etex \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luatex-bin \
texlive-manfnt \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
