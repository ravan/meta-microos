SUMMARY = "English Full Text styles for the datetime2 package"
DESCRIPTION = "English date and time styles that use words for the numbers and \
ordinals. This package provides the following date and time \
styles: 'en-fulltext', 'en-FullText', 'en-FULLTEXT', and the \
additional time style 'en-Fulltext'. (The date equivalent can \
be obtained through commands like \\Today.) Unlike the base \
styles provided by datetime2.sty, these styles aren't \
expandable styles. This means that you can't use the date or \
time in PDF bookmarks or in the argument of certain commands, \
such as \\MakeUppercase, while these styles are in use."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36705"

RPM_NAME = "texlive-datetime2-en-fulltext-2026.226.1.0svn36705-59.2.noarch.rpm"
RPM_HASH = "c5bcb8792ded380dcdfcb6a747f1395b37788364f8ebc55c30a9682ae547cae8c03098a68966955c567231feac34f143f8c1908ae452fda96c5e5f1184f62241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-en-fulltext.sty \
texlive-datetime2-en-fulltext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime2.sty \
tex-fmtcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
