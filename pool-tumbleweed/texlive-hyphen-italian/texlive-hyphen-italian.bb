SUMMARY = "Italian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Italian in ASCII encoding. Compliant \
with the Recommendation UNI 6461 on hyphenation issued by the \
Italian Standards Institution (Ente Nazionale di Unificazione \
UNI)."
LICENSE = "LGPL-2.1-or-later"

PV = "2026.226.4.8gsvn78069"

RPM_NAME = "texlive-hyphen-italian-2026.226.4.8gsvn78069-60.2.noarch.rpm"
RPM_HASH = "02d87cd335208aee5543790730c4930e1f3b2b144aea3021330143028a5c15229db494740fda195b2b039f45e01e3d6a46c41c56df11dc0eb8a71e9fbec44d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-it.tex \
tex-hyph-quote-it.tex \
tex-loadhyph-it.tex \
texlive-hyphen-italian"

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
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
