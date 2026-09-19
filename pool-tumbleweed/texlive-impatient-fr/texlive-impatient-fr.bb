SUMMARY = "Free edition of the book 'TeX for the Impatient'"
DESCRIPTION = "'TeX for the Impatient' is a book (of around 350 pages) on TeX, \
Plain TeX and Eplain. The book is also available in French and \
Chinese translations."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.2020svn54080"

RPM_NAME = "texlive-impatient-fr-2026.226.2020svn54080-60.2.noarch.rpm"
RPM_HASH = "72c763d8f90fda91479fdf63f27f0cc5478d9ac2dc01554c09337ec7f1a4a4926712864e1787dc0457330ee9e8970e58e11cd783f95796f73a0fb0eac2c4603d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-impatient-fr"

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
