SUMMARY = "French hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for French in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78069"

RPM_NAME = "texlive-hyphen-french-2026.226.svn78069-60.2.noarch.rpm"
RPM_HASH = "8ea7168616ab69108f8accafdc49b24f55b9618737226e76a1dfdebc58c3ed6e50a6a544aab04bf1b8746178058ce7df150548a270a477c4ffe49001fa166093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-fr.ec.tex \
tex-hyph-fr.tex \
tex-hyph-quote-fr.tex \
tex-loadhyph-fr.tex \
texlive-hyphen-french"

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
