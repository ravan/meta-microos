SUMMARY = "Support for using T2 encoding"
DESCRIPTION = "The T2 bundle provides a variety of separate support functions \
for using Cyrillic characters in LaTeX: the mathtext package, \
for using Cyrillic letters 'transparently' in formulae; the \
citehack package, for using Cyrillic (or indeed any non-ascii) \
characters in citation keys; support for Cyrillic in BibTeX; \
support for Cyrillic in Makeindex; and various items of font \
support."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn47870"

RPM_NAME = "texlive-t2-2026.226.svn47870-64.2.noarch.rpm"
RPM_HASH = "59263655a6883e2998a411966813295aaa589d2a11f406835c97363cfe20264313edef9523e536aadc314a076e31977bbd32bf26ee7ca86c0c546243507ef469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-alias-cmc.tex \
tex-alias-wncy.tex \
tex-citehack.sty \
tex-cyralias.tex \
tex-fnstcorr.tex \
tex-mathtext.sty \
tex-misccorr.sty \
tex-t2a-mod1.enc \
tex-t2a-mod2.enc \
tex-t2a.enc \
tex-t2b.enc \
tex-t2c.enc \
tex-x2.enc \
texlive-t2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-enumerate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
