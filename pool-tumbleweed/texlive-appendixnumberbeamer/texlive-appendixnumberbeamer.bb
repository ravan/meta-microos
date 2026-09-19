SUMMARY = "Manage frame numbering in appendixes in beamer"
DESCRIPTION = "This package fixes the frame numbering in beamer when using an \
appendix such that the slides from the appendix are not counted \
in the total frame number of the main part of the document. The \
total frame number counter is reset to 0 when entering the \
appendix. The standard usage is to include \
\\usepackage{appendixnumberbeamer} in the preamble and then \
declare the beginning of the appendix as usual using the \
\\appendix command."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-appendixnumberbeamer-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "7d3316b98893c6c56bd7d06ff9c5056b5f337f76e5a02f162f00a721d629039914322000efcf9a151ffae61857811ae035faa27a46910b5d00318fa685c6b6d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-appendixnumberbeamer.sty \
texlive-appendixnumberbeamer"

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
