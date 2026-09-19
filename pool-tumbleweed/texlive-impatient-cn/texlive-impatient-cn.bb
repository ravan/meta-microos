SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.2020svn54080"

RPM_NAME = "texlive-impatient-cn-2026.226.2020svn54080-60.2.noarch.rpm"
RPM_HASH = "e9d400260004cfb3ecf037d89d4ce6a721a97831cc24560cafcb28a5d5723e679df432397efd86d902913f30c691d750068ad8a5462a59bd7c5bb96a1d661c5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-impatient-cn"

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
