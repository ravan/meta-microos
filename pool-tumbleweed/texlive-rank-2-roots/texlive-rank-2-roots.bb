SUMMARY = "Draw (mathematical) rank 2 root systems"
DESCRIPTION = "This package concerns mathematical drawings arising in \
representation theory. The purpose of this package is to ease \
drawing of rank 2 root systems, with Weyl chambers, weight \
lattices, and parabolic subgroups. Required packages are tikz, \
etoolbox, expl3, pgfkeys, pgfopts, xparse, and xstring."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn75301"

RPM_NAME = "texlive-rank-2-roots-2026.226.1.2svn75301-60.4.noarch.rpm"
RPM_HASH = "7fc2fb37244182270d70bf12b926570289d3877f2571dae0daa37d058f01a788cb23efd8f256abf95198cb2faf60635dce2d33d2b55c7ea4783a11581001bbcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rank-2-roots.sty \
texlive-rank-2-roots"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
