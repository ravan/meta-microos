SUMMARY = "Alternative language support for Omega/Lambda"
DESCRIPTION = "A language support package for Omega/Lambda. This replaces the \
original omega package for use with Lambda, and provides extra \
facilities (including Babel-like language switching, which \
eases porting of LaTeX documents to Lambda)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn21933"

RPM_NAME = "texlive-antomega-2026.226.0.0.8svn21933-61.2.noarch.rpm"
RPM_HASH = "4d60c9cd7e056bbe6f24b767fc486e8200f9ab53ddcb2bfd9a683b8aedb07ef4c2a72e01087c6ade97463c883980e754439ea309686b7ee3059b90e3a79999fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-antomega.cfg \
tex-antomega.sty \
tex-grhyph16.tex \
tex-hyphen.cfg \
tex-lgc0700.def \
tex-lgrenc-antomega.def \
tex-ograhyph4.tex \
tex-ogrmhyph4.tex \
tex-ogrphyph4.tex \
tex-omega-english.ldf \
tex-omega-french.ldf \
tex-omega-german.ldf \
tex-omega-greek.ldf \
tex-omega-latin.ldf \
tex-omega-latvian.ldf \
tex-omega-polish.ldf \
tex-omega-russian.ldf \
tex-omega-spanish.ldf \
tex-ruhyph16.tex \
tex-t1enc-antomega.def \
tex-t2aenc-antomega.def \
tex-uni0100.def \
tex-uni0370.def \
tex-uni0400.def \
tex-uni1f00.def \
tex-ut1enc-antomega.def \
texlive-antomega"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-omega \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
