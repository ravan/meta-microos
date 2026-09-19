SUMMARY = "The MLTeX system"
DESCRIPTION = "MLTeX is a modification of TeX version >=3.0 that allows the \
hyphenation of words with accented letters using ordinary \
Computer Modern (CM) fonts. The system is distributed as a TeX \
change file."
LICENSE = "SUSE-TeX"

PV = "2026.226.2.2svn71363"

RPM_NAME = "texlive-mltex-2026.226.2.2svn71363-61.2.noarch.rpm"
RPM_HASH = "47941a8693a62530bb26ac76168b557fbf116564aa4f060733d6519d4d5fef68ca3e0cd247e70a2ad0e3b7165a07789d5c2dc6a1f5e223952d6d3f8ac6b6c079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lo1enc.def \
tex-mlltxchg.def \
tex-mltex.sty \
texlive-mltex"

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
texlive-babel \
texlive-cm \
texlive-dehyph \
texlive-filesystem \
texlive-firstaid \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-latex \
texlive-latex-fonts \
texlive-latexconfig \
texlive-mltex-bin \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
