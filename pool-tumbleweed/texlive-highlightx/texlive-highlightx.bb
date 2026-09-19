SUMMARY = "Highlight formulas or paragraphs"
DESCRIPTION = "This package provides commands (in French or English) to \
highlight formulas or paragraphs with handwriting effect: coded \
using soul and TikZ; \\SurlignerFormule and \\SurlignerTexte in \
French; \\HighlightFormula and \\HighlightText in English. The \
code for highlighting paragraphs with a handwriting effect has \
been contributed by Antal Spector-Zabusky."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.8svn77296"

RPM_NAME = "texlive-highlightx-2026.226.0.0.1.8svn77296-60.4.noarch.rpm"
RPM_HASH = "0c0b67da8a87dcdf8b42706f94b3e1244070347d25b4546268dcb5312814fa41e8eb36a0fcb8425d2df27e9e29d93cc3da76b72dce2a434e3806872c3db30b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-highlightx.sty \
texlive-highlightx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-simplekv.sty \
tex-soul.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
