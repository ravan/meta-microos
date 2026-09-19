SUMMARY = "Linguistic tree diagrams for Role and Reference Grammar (RRG) with LaTeX"
DESCRIPTION = "A set of LaTeX macros that makes it easy to produce linguistic \
tree diagrams suitable for Role and Reference Grammar (RRG). \
This package allows the construction of trees with crossing \
lines, as is required by this theory for many languages. There \
is no known limit on number of tree nodes or levels. Requires \
the pst-node and pst-tree LaTeX packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn27322"

RPM_NAME = "texlive-rrgtrees-2026.226.1.1svn27322-60.2.noarch.rpm"
RPM_HASH = "e46564882de62b86294ea51c8d1e559f7ecb3bf423ab36453d8f04c2e875726bbfd38255b0b02dbab398bdedb07fc01a9ca52b3066c7a80d727e212a36ae9477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rrgtrees.sty \
texlive-rrgtrees"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pst-tree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
