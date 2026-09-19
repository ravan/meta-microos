SUMMARY = "PLaTeX2e and miscellaneous macros for upTeX"
DESCRIPTION = "The bundle provides pLaTeX2e macros for upTeX by Takuji Tanaka. \
This is a community edition syncing with platex. The bundle \
depends on platex."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-uplatex-2026.226.svn77830-60.2.noarch.rpm"
RPM_HASH = "aa9670ebbf80fd3bdb17ff9c77fdff17801d983db8294b5e6bd9f75ab21f0fc736946bae933e5e3d877add69556ae4d69382772a6d560d5709eb397e79f6514d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jt2gt.fd \
tex-jt2mc.fd \
tex-jy2gt.fd \
tex-jy2mc.fd \
tex-ujarticle.cls \
tex-ujbk10.clo \
tex-ujbk11.clo \
tex-ujbk12.clo \
tex-ujbook.cls \
tex-ujreport.cls \
tex-ujsize10.clo \
tex-ujsize11.clo \
tex-ujsize12.clo \
tex-ukinsoku.tex \
tex-uptrace.sty \
tex-utarticle.cls \
tex-utbk10.clo \
tex-utbk11.clo \
tex-utbk12.clo \
tex-utbook.cls \
tex-utreport.cls \
tex-utsize10.clo \
tex-utsize11.clo \
tex-utsize12.clo \
texlive-uplatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-plext.sty \
tex-ptrace.sty \
texlive \
texlive-babel \
texlive-cm \
texlive-filesystem \
texlive-firstaid \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3backend-dev \
texlive-l3kernel \
texlive-l3kernel-dev \
texlive-latex \
texlive-latex-base-dev \
texlive-latex-firstaid-dev \
texlive-latex-fonts \
texlive-platex \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data \
texlive-uplatex-bin \
texlive-uptex \
texlive-uptex-fonts"

inherit rpm
