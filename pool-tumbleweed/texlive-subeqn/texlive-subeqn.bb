SUMMARY = "Package for subequation numbering"
DESCRIPTION = "Sometimes it is necessary to be able to refer to subexpressions \
of an equation. In order to do that these subexpressions should \
be numbered. In standard LaTeX there is no provision for this. \
To solve this problem Stephen Gildea once wrote subeqn.sty for \
LaTeX 2.09; Donald Arseneau rewrote the macros and Johannes \
Braams made them available for LaTeX2e. Note that this package \
is not compatible with the package subeqnarray (written by \
Johannes Braams), but it can be used together with the LaTeX \
class options leqno and fleqn."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0csvn77682"

RPM_NAME = "texlive-subeqn-2026.226.2.0csvn77682-64.2.noarch.rpm"
RPM_HASH = "ca01034958e4fe2096e50cb7bead5a17bce92c3fa914d528040fe2d9e5a55213009bf72b548a9c4238ee1494e4a29e76b02b7d388f372f8cd5c0fd2521268e13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subeqn.sty \
texlive-subeqn"

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
