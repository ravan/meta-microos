SUMMARY = "Typesetting TEI-xml compliant Critical Editions"
DESCRIPTION = "ekdosis is a LuaLaTeX package designed for multilingual \
critical editions. It can be used to typeset texts and \
different layers of critical notes in any direction accepted by \
LuaTeX. Texts can be arranged in running paragraphs or on \
facing pages, in any number of columns which in turn can be \
synchronized or not. In addition to printed texts, ekdosis can \
convert .tex source files so as to produce TEI xml-compliant \
critical editions. Database-driven encoding under LaTeX then \
allows extraction of texts entered segment by segment according \
to various criteria: main edited text, variant readings, \
translations or annotated borrowings between texts."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.4svn69568"

RPM_NAME = "texlive-ekdosis-2026.226.1.4svn69568-61.4.noarch.rpm"
RPM_HASH = "a864c1e04f23a4e772eef44837a66a8d19906ab5cf410c0d2df2552b67a71426353348f8642e3df0be9f7eaa7cf278a50f7ed28d7636d6b65cfe94194f662c71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ekdosis.sty \
texlive-ekdosis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expkv-def.sty \
tex-expkv-opt.sty \
tex-ifoddpage.sty \
tex-iftex.sty \
tex-keyfloat.sty \
tex-lineno.sty \
tex-ltxcmds.sty \
tex-luacode.sty \
tex-paracol.sty \
tex-parnotes.sty \
tex-pdftexcmds.sty \
tex-refcount.sty \
tex-tcolorbox.sty \
tex-trivfloat.sty \
tex-verse.sty \
tex-zref-abspage.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
