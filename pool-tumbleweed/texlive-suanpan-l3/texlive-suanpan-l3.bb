SUMMARY = "Traditional Chinese 7-bids suanpan (abacus) package based on l3draw"
DESCRIPTION = "This traditional Chinese 7-bids abacus drawing package utilizes \
l3draw and is developed with expl3. It can effectively manage \
both upper and lower bids, while also considering bottom bid, \
top bid, and hanging bid. The package offers a unique \
environment for drawing abacuses, denoted as suanpan. Within \
this environment, 7 specialized macros are available for the \
creation of abacuses. The \\rod macro is used to lay out a \
single rod, while the \\rod* macro draws a counting point on \
this rod's beam. The \\rods macro is capable of laying out a set \
of rods. The \\bid macro colors the specified bid. The \\bids \
macro colors all inner bids that are near the beam, while the \
\\bids* macro colors all outer bids that are far from the beam. \
Lastly, the \\lrframe macro is used to lay out the left and \
right frames of an abacus. At the same time, the package offers \
customization options for abacus, including line width, draw \
color, fill color, bid space, rod space, etc. These can be \
configured through package options, suanpan environment \
options, or the \\suanpanset macro."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.4svn76924"

RPM_NAME = "texlive-suanpan-l3-2026.226.1.2.4svn76924-64.2.noarch.rpm"
RPM_HASH = "2c48165fb5aa647c6e9610370faa293382bf9314603448df534d621fae1d5bc096cb6bdb88963a7203581865fd4e85bb734daee91b17b915be4ec9a80680128c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-suanpan-l3.sty \
texlive-suanpan-l3"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3draw.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
