SUMMARY = "Plot pulleys, using PSTricks"
DESCRIPTION = "The package enables the user to draw pulley systems with up to \
6 pulleys. The pulley diagrams are labelled with the physical \
properties of the system. The package uses pstricks and \
requires several PSTricks-related packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn62977"

RPM_NAME = "texlive-pst-pulley-2026.226.0.0.02svn62977-60.4.noarch.rpm"
RPM_HASH = "30f9ca2b19558518724c2bfe7dc04bc0859c4e50bb41b65f7a967d1e405d0cbb343e6a23208f84a53c568fd88e26db917b19ed5204519c8af5c1391c8beba321"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-pulley.sty \
tex-pst-pulley.tex \
texlive-pst-pulley"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
