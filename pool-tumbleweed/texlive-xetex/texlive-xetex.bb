SUMMARY = "An extended variant of TeX for use with Unicode sources"
DESCRIPTION = "XeTeX is a TeX typesetting engine using Unicode and supporting \
modern font technologies such as OpenType, TrueType or Apple \
Advanced Typography (AAT), including OpenType mathematics \
fonts. XeTeX supports many extensions that reflect its origins \
in linguistic research; it also supports micro-typography (as \
available in pdfTeX). XeTeX was developed by the SIL (the first \
version was specifically developed for those studying \
linguistics, and using Macintosh computers). XeTeX's immediate \
output is an extended variant of DVI format, which is \
ordinarily processed by a tightly bound processor (called \
xdvipdfmx), that produces PDF. XeTeX is released as part of TeX \
Live; documentation has arisen separately. Source code is \
available from ctan:/systems/texlive/Source/."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-xetex-2026.226.svn77830-59.4.noarch.rpm"
RPM_HASH = "99c041385f83110015aa0e23883b49a4440b9aa6f573c0ae4b1bde6484e0afb3f86acc508dbfdabf8a7186f2c1181fcf54281461d9465c3e09f9547bc8f86312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qx-unicode.map \
tex-tex-text.map \
texlive-xetex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl \
perl-TeXLive--TLUtils \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-texmf.cnf \
texlive \
texlive-babel \
texlive-cm \
texlive-dvipdfmx \
texlive-etex \
texlive-filesystem \
texlive-firstaid \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-latex \
texlive-latex-fonts \
texlive-lm \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-texlive.infra \
texlive-unicode-data \
texlive-xetex-bin \
texlive-xetexconfig"

inherit rpm
