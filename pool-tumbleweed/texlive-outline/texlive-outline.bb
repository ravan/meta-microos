SUMMARY = "List environment for making outlines"
DESCRIPTION = "The package defines an outline environment, which provides \
facilities similar to enumerate, but up to 6 levels deep."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18360"

RPM_NAME = "texlive-outline-2026.226.svn18360-61.2.noarch.rpm"
RPM_HASH = "3fd66f3b8c930e97ff6eb7347671674d6fd6911c4b65dd81ab4bdca5c8edfebdb80cb541c210b0278db1f09d17d43a3fbb8a522ec6d5aeb24d8031b27604e3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outline.sty \
texlive-outline"

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
