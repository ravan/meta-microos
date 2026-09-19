SUMMARY = "Sophisticated colour gradients"
DESCRIPTION = "This PStricks package covers all the colour gradient \
functionality of pst-grad (part of the base PSTricks \
distribution), and provides the following facilities: it \
permits the user to specify an arbitrary number of colours, \
along with the points at which they are to be reached; it \
converts between RGB and HSV behind the scenes; it provides \
concentric and radial gradients; it provides a command \\psBall \
that generates bullets with a three-dimensional appearance; and \
uses the xkeyval package for the extended key handling."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.31svn24391"

RPM_NAME = "texlive-pst-slpe-2026.226.1.31svn24391-60.4.noarch.rpm"
RPM_HASH = "d872f7d71382ba59690a9483549b791e45430dca5944d08bd52991f6d4c88906fc2117d62191534c4cb2abd23361c42a349db93c9f6b11d9632c32006629793b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-slpe.sty \
tex-pst-slpe.tex \
texlive-pst-slpe"

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
