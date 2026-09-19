SUMMARY = "Typeset circled numbers"
DESCRIPTION = "This package generates circled numbers (or other kinds of \
markers or small text) to mark 'steps' in procedures, \
exercises, and so on."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.3svn77682"

RPM_NAME = "texlive-circledsteps-2026.226.1.3.3svn77682-60.2.noarch.rpm"
RPM_HASH = "cdcbc6e88caf893bbc891b16cc9f234b667c7f8dcc71d234c7825e8ed6ef98fa0ef97f2221cc3d72dfd67cd911135f2f71f9eaeae7b14a12b5462762dd7db583"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-circledsteps.sty \
texlive-circledsteps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pgfkeys.sty \
tex-pict2e.sty \
tex-picture.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
