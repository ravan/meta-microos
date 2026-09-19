SUMMARY = "Draw programs like 'scratch'"
DESCRIPTION = "This package permits to draw program charts in the style of the \
scatch project (scratch.mit.edu). It depends on the other LaTeX \
packages TikZ and simplekv."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19svn61921"

RPM_NAME = "texlive-scratch3-2026.226.0.0.19svn61921-60.2.noarch.rpm"
RPM_HASH = "ab54ee5c716136512c671978566534747061574a8790cc9d871fb49a1c07f8832ea2a1af0210aecfed31ea6e1ed182536cdaba2f3e4d479208767f3317c895cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scratch3.sty \
texlive-scratch3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-simplekv.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
