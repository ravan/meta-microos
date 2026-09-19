SUMMARY = "Bibliography style for Chalmers University of Technology"
DESCRIPTION = "The package, heavily based on the harvard package for \
Harvard-style citations, provides a citation suite for students \
at Chalmers University of Technology that follows given \
recommendations."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9999svn28552"

RPM_NAME = "texlive-chscite-2026.226.2.9999svn28552-60.2.noarch.rpm"
RPM_HASH = "964ad08eb3325910e1f5c1d120bf17759ff038ae0ae8bc09f249ab8613ea291425fad3326f2aafd767aaca8e575d6df4e78060c0759e8ac26bbde9651f406add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chscite.sty \
texlive-chscite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
