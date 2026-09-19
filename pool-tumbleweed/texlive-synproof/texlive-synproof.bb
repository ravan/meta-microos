SUMMARY = "Easy drawing of syntactic proofs"
DESCRIPTION = "The package provides a set of macros based on PSTricks that \
will enable you to draw syntactic proofs easily (inspired by \
the Gamut books). Very few commands are needed, however fine \
tuning of the various parameters (dimensions) can still be \
achieved through 'key=value' pairs."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-synproof-2026.226.1.0svn15878-64.2.noarch.rpm"
RPM_HASH = "d50b9f1402bfc5c861ec5a647145148c16e7e1ee6d4e2ff90803a0f1d593ce52a67fdd3c06455a9e63dd7ccbae2487a8f13ca991138bfca0fd2a0b6446ea7e2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-synproof.sty \
texlive-synproof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-keyval.sty \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
