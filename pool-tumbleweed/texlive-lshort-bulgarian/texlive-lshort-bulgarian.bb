SUMMARY = "Bulgarian translation of the 'Short Introduction to LaTeX2e'"
DESCRIPTION = "The source files, PostScript and PDF files of the Bulgarian \
translation of the 'Short Introduction to LaTeX2e'."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77050"

RPM_NAME = "texlive-lshort-bulgarian-2026.226.svn77050-61.2.noarch.rpm"
RPM_HASH = "2dfdc7aaea3c11f67854137d624efcdf8f16d61bdb75e27ad9479678c7d53039f1413595abddd05ec0cd33ab7317f8a932cb2a782cc973233cc978539976c1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-bulgarian"

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
