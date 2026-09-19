SUMMARY = "BibTeX styles to implement an address database"
DESCRIPTION = "The bundle provides a collection of BibTeX style files to turn \
an address database stored in the .bib format into files \
suitable for printing as address books or included into letter \
classes like akletter or scrletter2. The data may be sorted \
either by name or birthday and output provides files in various \
formats for address books or time planners."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76790"

RPM_NAME = "texlive-adrconv-2026.226.1.4svn76790-61.2.noarch.rpm"
RPM_HASH = "1d8e92d9d57e5e254d75bd1474385f43bdbbebadb426f78d9cfdecdb48ffda7a46ff0d940e30f79f04b63720399874d24e16314d1eaf2ef7d4bbdc158fea8084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adrdir.cfg \
tex-adrplaner.cfg \
tex-adrsmall.cfg \
texlive-adrconv"

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
