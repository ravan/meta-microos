SUMMARY = "Allow multiple web change files"
DESCRIPTION = "Tie was originally developed to allow web programmers to apply \
more than one change file to their source. The program may also \
be used to create a new version of a .web file that \
incorporates existing changes."
LICENSE = "LPPL-1.0"

PV = "2026.227.2.4svn77830"

RPM_NAME = "texlive-tie-2026.227.2.4svn77830-62.2.noarch.rpm"
RPM_HASH = "9607a60c4503e8b571727662c5d3eb0d0102dc62ea7a0ddb39a6fc2e76ecbb27bb7c6cbed5b42525adba961c85bf7a90b8c5d951325b3da8a08b3e0d0069b2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-tie.1 \
texlive-tie"

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
texlive-scripts-bin \
texlive-tie-bin"

inherit rpm
