SUMMARY = "Typeset fregean Begriffsschrift"
DESCRIPTION = "The package defines a number of new commands for typesetting \
fregean Begriffsschrift in LaTeX. It is loosely based on the \
package begriff, and offers a number of improvements including \
better relative lengths of the content stroke with respect to \
other strokes, content strokes that point at the middle of \
lines rather than the bottom, a greater width for the assertion \
stroke as compared to the content stroke, a more intuitive \
structure for the conditional, greater care taken to allow for \
the linewidth in the spacing of formulas."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn27417"

RPM_NAME = "texlive-frege-2026.226.1.3svn27417-60.2.noarch.rpm"
RPM_HASH = "1d8f967a3cd292ef3b7735dd59ed0cd216b50c8dc624a5807d471314eeaa0b9619802256d498dcec1ea3d77307bc009d9d3e5538bb2fc4c4fb8110885dbc6af3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frege.sty \
texlive-frege"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-bguq.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
