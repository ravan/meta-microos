SUMMARY = "Engraving Gregorian Chant scores"
DESCRIPTION = "Gregorio is a software application for engraving Gregorian \
Chant scores on a computer. Gregorio's main job is to convert a \
gabc file (simple text representation of a score) into a \
GregorioTeX file, which makes TeX able to create a PDF of your \
score."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.6.1.0svn74348"

RPM_NAME = "texlive-gregoriotex-2026.226.6.1.0svn74348-60.4.noarch.rpm"
RPM_HASH = "38b4f0d5cf3c7361b85ee10d63ca540fb6d9972a764aeee313d1eda95f0366794976b14d97a588fd6e66fcf50bb271310a3120e262334881f16dbfb035bd7cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gregorio-vowels.dat \
tex-gregoriosyms.sty \
tex-gregoriotex-chars.tex \
tex-gregoriotex-common.tex \
tex-gregoriotex-gsp-default.tex \
tex-gregoriotex-main.tex \
tex-gregoriotex-nabc.tex \
tex-gregoriotex-signs.tex \
tex-gregoriotex-spaces.tex \
tex-gregoriotex-syllable.tex \
tex-gregoriotex-symbols.tex \
tex-gregoriotex.sty \
tex-gregoriotex.tex \
texlive-gregoriotex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-luacolor.sty \
tex-luamplib.sty \
tex-luaotfload.sty \
tex-luatexbase.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-gregoriotex-bin \
texlive-gregoriotex-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
