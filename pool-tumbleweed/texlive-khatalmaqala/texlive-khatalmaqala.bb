SUMMARY = "Arabic font for university articles"
DESCRIPTION = "This font family is a modification of 'cm-unicode' fonts, with \
Arabic support. It was originally made for a group of \
undergraduate students at Misr University For Science And \
Technology (Egypt) many years ago. After a few semesters, it \
had become the main font for their articles and assignments. \
Now, it is on CTAN for easier access. khatalmaqala = khat \
(font) + maqala (article) = font for article"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0.2svn68280"

RPM_NAME = "texlive-khatalmaqala-2026.226.1.0.2svn68280-63.2.noarch.rpm"
RPM_HASH = "6d7403ae696efb396eb8856eadbdfb24a5f854141e2bd1dd260db554716d2e4227c61ad51e633a4cb9b9de614d4aa6cc19c77399576d901e34a388987d9d404e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-khatalmaqala"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-khatalmaqala-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
