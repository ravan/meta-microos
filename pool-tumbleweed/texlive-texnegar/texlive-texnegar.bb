SUMMARY = "Kashida justification in XeLaTeX and LuaLaTeX"
DESCRIPTION = "In some cursive scripts such as Persian or Arabic, kashida is \
used to create justification. In this type of justification \
characters are elongated rather than expanding spaces between \
words. The kashida justification in xepersian has many bugs. \
Also it has problems with some fonts. The xepersian-hm package \
was the first attempt to fix these bugs in xepersian, which \
uses the XeTeX engine. This package extends the kashida \
justification to be used with the LuaTeX engine, too. \
Explanation of the package name: Negar, in Persian, is the \
present stem of negaashtan meaning to design, to paint, to \
write; and as a noun it means 'sweetheart, idol, beloved, \
figuratively referring to a beautiful woman, pattern, painting, \
and artistic design'."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1esvn76924"

RPM_NAME = "texlive-texnegar-2026.227.0.0.1esvn76924-62.2.noarch.rpm"
RPM_HASH = "72eb7d6fd099ae6a116f0f1c53d04f7983958c4aa76d1be76750b771d87aa21988a8d76dc2e860284065a45abed71533b82632fba53fbdb7a09621090ad1b3d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texnegar-common-kashida.tex \
tex-texnegar-ini.tex \
tex-texnegar-luatex.sty \
tex-texnegar-xetex-kashida.tex \
tex-texnegar-xetex.sty \
tex-texnegar.sty \
texlive-texnegar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-environ.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-l3keys2e.sty \
tex-newverbs.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
