SUMMARY = "Facilities for setting interlinear glossed text"
DESCRIPTION = "The package provides extensible macros for setting interlinear \
glossed text -- useful, for instance, for typing linguistics \
papers. The operative word here is 'extensible': few features \
are built in, but some flexible and powerful facilities are \
included for adding your own."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn29103"

RPM_NAME = "texlive-dvgloss-2026.226.0.0.1svn29103-61.4.noarch.rpm"
RPM_HASH = "0907fd25ff55c8d74c620f38a1a458229d24219bf88460ff7843de9c5931b6b507c2d06faf70ab931747a858c1d08d0aa373c7911848f59be14ca2f4e85ad244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dvgloss.sty \
texlive-dvgloss"

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
