SUMMARY = "Formal proofs in the style of sequent calculus"
DESCRIPTION = "This package provides commands to typeset proof trees in the \
style of sequent calculus and related systems. The commands \
allow for writing inferences with any number of premises and \
alignment of successive formulas on an arbitrary point. Various \
options allow complete control over spacing, styles of \
inference rules, placement of labels, etc. The package requires \
expl3 and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.1svn77682"

RPM_NAME = "texlive-ebproof-2026.226.2.1.1svn77682-61.4.noarch.rpm"
RPM_HASH = "8250a3959f88a5619fa92ddc57fdd5f0094312fb0a1f062d8dd222b71e53b8e9ddba67ac8a3973d5e62c6096fb695fdfe43371c754f73308923d2380186632e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ebproof.sty \
texlive-ebproof"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
