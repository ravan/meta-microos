SUMMARY = "Font esint10 in Type 1 format"
DESCRIPTION = "This is Eddie Saudrais's font esint10 in Adobe Type 1 format. \
The Adobe Type 1 implementation was generated from the original \
Metafont using mftrace. This distribution does not contain the \
TFM files that are necessary to use the fonts with TeX; the TFM \
files can be generated from the Metafont sources obtained by \
following the instructions in the normal way."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-esint-type1-2026.226.svn15878-61.4.noarch.rpm"
RPM_HASH = "b6c7cae9d06c28a584d982152f6630abf869902c133c8763d5fbbd1d7a5fb293bd7ce99d97910f716f732674e0277304c64df0392afac4db354c41f7312734a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esint.map \
tex-esint.tex \
texlive-esint-type1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-esint \
texlive-esint-type1-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
