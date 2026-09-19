SUMMARY = "Introduction to LaTeX, in Chinese"
DESCRIPTION = "A Chinese edition of the not so short introduction to LaTeX2e, \
with additional information of typesetting Chinese language."
LICENSE = "GFDL-1.3-or-later"

PV = "2026.226.6.05svn73160"

RPM_NAME = "texlive-lshort-chinese-2026.226.6.05svn73160-61.2.noarch.rpm"
RPM_HASH = "9363c88a79a9d4d5a6047edf2e502341f1e6272e63e67ced57d676b9c155dbc09e4a541b620611535d7a36ce43c31cc36ff2a875b502f24d8b3d37c1406f170d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-chinese"

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
