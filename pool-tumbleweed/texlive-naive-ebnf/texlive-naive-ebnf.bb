SUMMARY = "EBNF in plain text"
DESCRIPTION = "With the help of this LaTeX package a context-free grammar \
(CFG) may be rendered in a plain-text mode using a simplified \
Extended Backus-Naur Form (EBNF) notation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.18svn72843"

RPM_NAME = "texlive-naive-ebnf-2026.226.0.0.0.18svn72843-61.2.noarch.rpm"
RPM_HASH = "07ba879e507327051057d2e4a8ad0aa9c3e9f7ecda16ef4e4cb2a0a6e9244ed9167727c9b2209cbb31aa99c71a4636f7737b1a7b4f3df8246fa4a678e841fcb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-naive-ebnf.sty \
texlive-naive-ebnf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-pgfopts.sty \
tex-xcolor.sty \
texlive \
texlive-filecontentsdef \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
