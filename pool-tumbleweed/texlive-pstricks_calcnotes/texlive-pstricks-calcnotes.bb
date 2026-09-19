SUMMARY = "Use of PSTricks in calculus lecture notes"
DESCRIPTION = "The bundle shows the construction of PSTricks macros to draw \
Riemann sums of an integral and to draw the vector field of an \
ordinary differential equation. The results are illustrated in \
a fragment of lecture notes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn34363"

RPM_NAME = "texlive-pstricks_calcnotes-2026.226.1.2svn34363-60.4.noarch.rpm"
RPM_HASH = "5b73b791498fbbd0eaa93c5895c79186acda5caf1a8d9766d12c23e3bf9f1098e0ac1a04bc2f0ce62d35e014843214b7ac81af93013e5c7da54aff5f23672cf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-calcnotes"

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
