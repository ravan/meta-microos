SUMMARY = "Changing fonts, sizes and encodings in Plain TeX"
DESCRIPTION = "The fontch macros allow the user to change font size and family \
anywhere in a plain TeX document. Sizes of 8, 10, 12, 14, 20 \
and 24 points are available. A sans serif family (\\sf) is \
defined in addition to the families already defined in plain \
TeX. Optional support for Latin Modern T1 and TS1 fonts is \
given. There are macros for non-latin1 letters and for most TS1 \
symbols. Math mode always uses CM fonts. A command for \
producing doubled-spaced documents is also provided. The \
present version of the package is designed to deal with the \
latest release of the Latin Modern fonts version 1.106. \
Unfortunately, it can no longer support earlier versions of the \
fonts, so an obsolete version of the package is retained for \
users who don't yet have access to the latest version of the \
fonts."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn17859"

RPM_NAME = "texlive-fontch-2026.226.2.2svn17859-60.2.noarch.rpm"
RPM_HASH = "c8d851e3a44e38012f712ba703c6064e3acac5cc4af8a6e3027220bb706941fdda0ef817a984c2041ca6ae1989f1ac804fb86434fe3867dff4895abe1b089846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DSmac.tex \
tex-TS1mac.tex \
tex-bsymbols.tex \
tex-fontch-doc.tex \
tex-fontch.tex \
texlive-fontch"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
