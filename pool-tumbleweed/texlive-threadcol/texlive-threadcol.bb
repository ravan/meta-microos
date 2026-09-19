SUMMARY = "Organize document columns into PDF 'article thread'"
DESCRIPTION = "The package combines a document's columns into a PDF 'article \
thread'. PDF readers that support this mechanism (probably \
Adobe Acrobat/Reader only) can be instructed to scroll \
automatically from column to column, which facilitates \
on-screen reading of two-column documents. Even for \
single-column documents, threadcol supports the creation of \
multiple article threads, which help organize discontiguous but \
logically related regions of text into a form that the user can \
scroll through as if its contents were contiguous."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn28754"

RPM_NAME = "texlive-threadcol-2026.227.1.0svn28754-62.2.noarch.rpm"
RPM_HASH = "9160cf2f4559aead1f2c59d6c3df60c1580ffe8436a0f9fad9686c1f7d04851f5075966b8ab1d79054d5433238c3bc46ef56817973b9a2c838ddfef945a3d7c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-threadcol.sty \
texlive-threadcol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
