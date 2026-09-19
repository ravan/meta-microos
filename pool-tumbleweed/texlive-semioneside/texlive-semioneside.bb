SUMMARY = "Put only special contents on left-hand pages in two sided layout"
DESCRIPTION = "This package supports the preparation of semi one sided \
documents. That is, two sided documents, where all text is \
output on right-hand pages--as in a one-sided documents--and \
only special contents are output on left-hand pages on user \
request, e.g., floating objects."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.41svn15878"

RPM_NAME = "texlive-semioneside-2026.226.0.0.41svn15878-60.2.noarch.rpm"
RPM_HASH = "3f6bd9e6a5e129934a0526461450a9449f0e7ecaea155dfbdfcc181b9beda4f1608e1d86a786d4ae69f625cebfbe8205d3d7ab50f97997b7452736c682d2198d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-semioneside.sty \
texlive-semioneside"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
