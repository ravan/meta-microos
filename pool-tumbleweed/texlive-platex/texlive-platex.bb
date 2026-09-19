SUMMARY = "PLaTeX2e and miscellaneous macros for pTeX"
DESCRIPTION = "The bundle provides pLaTeX2e and miscellaneous macros for pTeX \
and e-pTeX. This is a community edition forked from the \
original ASCII edition (ptex-texmf-2.5)."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-platex-2026.226.svn77830-59.2.noarch.rpm"
RPM_HASH = "a374a16c8b382a86ce8058644e2270b29b74a960dc20fe2a3046bfd5b50e682ffe6ed010575f0891b346eef0edb63fae96c6d93a2fea45b0fc3e6034ed3e8506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exppl2e.sty \
tex-jarticle.cls \
tex-jarticle.sty \
tex-jbk10.clo \
tex-jbk11.clo \
tex-jbk12.clo \
tex-jbook.cls \
tex-jbook.sty \
tex-jltxdoc.cls \
tex-jreport.cls \
tex-jreport.sty \
tex-jsize10.clo \
tex-jsize11.clo \
tex-jsize12.clo \
tex-jt1gt.fd \
tex-jt1mc.fd \
tex-jy1gt.fd \
tex-jy1mc.fd \
tex-kinsoku.tex \
tex-oldpfont.sty \
tex-pfltrace.sty \
tex-pl209.def \
tex-platexrelease.sty \
tex-plexpl3.sty \
tex-plext.sty \
tex-plnews.cls \
tex-ptrace.sty \
tex-tarticle.cls \
tex-tarticle.sty \
tex-tbk10.clo \
tex-tbk11.clo \
tex-tbk12.clo \
tex-tbook.cls \
tex-tbook.sty \
tex-treport.cls \
tex-treport.sty \
tex-tsize10.clo \
tex-tsize11.clo \
tex-tsize12.clo \
texlive-platex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fltrace.sty \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-latex209.def \
tex-latexrelease.sty \
tex-ltxdoc.cls \
tex-oldlfont.sty \
tex-plautopatch.sty \
tex-shortvrb.sty \
tex-tracefnt.sty \
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
texlive-platex-bin \
texlive-ptex \
texlive-ptex-fonts \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data \
texlive-uptex"

inherit rpm
