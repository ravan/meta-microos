SUMMARY = "Flexible drafting of legal documents, especially in Dutch"
DESCRIPTION = "This package aims to simplify the writing process, especially \
for Dutch legal authors. It has also been implemented in \
English and can be expanded to include other languages. The \
package offers macros for typical legal structures and contains \
a referencing system."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.4svn72197"

RPM_NAME = "texlive-regulatory-2026.226.0.0.0.4svn72197-60.4.noarch.rpm"
RPM_HASH = "586439f9af722dfc6cf04a614f2fd46d244d0b1979a09b002fd61ef1397d8bcd184bc9e7c7a25eacc6996bcf3e8c3ae9a9701ac96c40bcd011acbe39fc0ecad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-regulatory.sty \
texlive-regulatory"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-attachfile2.sty \
tex-enumitem.sty \
tex-fmtcount.sty \
tex-glossaries-extra.sty \
tex-glossaries.sty \
tex-hyperref.sty \
tex-keyval.sty \
tex-markdown.sty \
tex-pgf.sty \
tex-pgfopts.sty \
tex-scrextend.sty \
tex-titlesec.sty \
tex-translations.sty \
tex-xassoccnt.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xpatch.sty \
tex-xr-hyper.sty \
tex-xspace.sty \
tex-xstring.sty \
tex-zref-clever.sty \
tex-zref-hyperref.sty \
tex-zref-user.sty \
tex-zref-xr.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
