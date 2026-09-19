SUMMARY = "Create outlines for scientific documents"
DESCRIPTION = "Every scientifc document requires outlining before it is \
written. This package adds simple macros for your LaTeX \
document."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn45601"

RPM_NAME = "texlive-outlining-2026.226.0.0.1svn45601-61.2.noarch.rpm"
RPM_HASH = "c92e4fb4e0442f1d0ff5957c207c0319ec184b14f3f7d33b3684cbebee68b83346e247ecafacd3a9a34d4544bf783a31133ef4c4765c2d3070cab6bf49c363ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outlining.sty \
texlive-outlining"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-todonotes.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
