SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.2020svn54080"

RPM_NAME = "texlive-impatient-2026.226.2020svn54080-60.2.noarch.rpm"
RPM_HASH = "fb71080eec64398dd5c20f72f8d774d8a55a6d0d815b1712a8231ee0350185abdb133966698327efb441fd58b1b75f03593f96d1e9f63995fc0479a017de4771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-impatient"

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
