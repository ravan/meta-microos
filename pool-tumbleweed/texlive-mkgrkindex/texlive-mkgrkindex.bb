SUMMARY = "Makeindex working with Greek"
DESCRIPTION = "Makeindex is resolutely stuck with Latin-based alphabets, so \
will not deal with Greek indexes, unaided. This package \
provides a Perl script that will transmute the index of a Greek \
document in such a way that makeindex will sort the entries \
according to the rules of the Greek alphabet."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn26313"

RPM_NAME = "texlive-mkgrkindex-2026.226.2.0svn26313-61.2.noarch.rpm"
RPM_HASH = "df1459fbe87abe59938e4bf29a39f2b5d41c71f8e95684cd96b645b9946d9ff8248d74df792edf86ea87fcddcd3fe38627d2a55c7c071c0e7e7a3e201f142bde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkgrkindex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mkgrkindex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
