SUMMARY = "VERBatim Automatic Splitting of External Files"
DESCRIPTION = "The package allows you to input (subsections of a) file, print \
them in verbatim mode, while automatically breaking up the \
input lines into pieces of a given length, which are output as \
figures. These figures are posted using the [H] specification, \
which forces LaTeX to place the figure at the spot of \
invocation, rather than floating the figures to the top of the \
next page. The package requires the verbatim, here and vrbexin \
packages."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn21922"

RPM_NAME = "texlive-verbasef-2026.226.1.1svn21922-60.2.noarch.rpm"
RPM_HASH = "0bcad940034b412c1d72811a78c389ef67c7605189d439b4158b3632aa6f1b9196b841e4656a32f8be4408b11a01dabea0a69ee44d09f686cf2d2da2e595906a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-verbasef.sty \
texlive-verbasef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-here.sty \
tex-verbatim.sty \
tex-vrbexin.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
