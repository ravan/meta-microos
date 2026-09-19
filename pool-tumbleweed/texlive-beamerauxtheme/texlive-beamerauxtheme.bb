SUMMARY = "Supplementary outer and inner themes for beamer"
DESCRIPTION = "This bundle provides a collection of inner and outer themes as \
supplements to the default themes in the beamer distribution. \
These themes can be used in combination with existing inner, \
outer, and color themes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02asvn56087"

RPM_NAME = "texlive-beamerauxtheme-2026.226.1.02asvn56087-61.2.noarch.rpm"
RPM_HASH = "87f87c790835a78c4969ae1244fbabc4af29de458814917ff64a88eb70890b421ee0d0c50a85ccc8f945fc3b22fb66cd3158399c4b8fcb5744a745f3a7e4c9cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerinnerthemesimplelines.sty \
tex-beamerouterthemesidebarwithminiframes.sty \
tex-beamerouterthemesplitwithminiframes.sty \
tex-beamerouterthemetwolines.sty \
texlive-beamerauxtheme"

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
