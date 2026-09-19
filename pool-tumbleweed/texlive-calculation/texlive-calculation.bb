SUMMARY = "Typesetting reasoned calculations, also called calculational proofs"
DESCRIPTION = "The calculation environment formats reasoned calculations, also \
called calculational proofs. The notion of reasoned \
calculations or calculational proofs was originally advocated \
by Wim Feijen and Edsger Dijkstra. The package accepts options \
fleqn and leqno (with the same effect as the LaTeX options \
fleqn and leqno, or may inherit the options from the document \
class). It allows steps and expressions to be numbered (by \
LaTeX equation numbers, obeying the LaTeX \\label command to \
refer to these numbers), and a step doesn't take vertical space \
if its hint is empty. An expression in a calculation can be \
given a comment; it is placed at the side opposite to the \
equation numbers. Calculations are allowed inside hints \
although numbering and commenting is then disabled."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35973"

RPM_NAME = "texlive-calculation-2026.226.1.0svn35973-59.2.noarch.rpm"
RPM_HASH = "a3bfff1a25dd0bf29e38dbfee86c916bb816fffda1f3091987b989342f63562d6317fc73bf9b6ac5757edea3e493c7f803cb22a06c294919cc82630015dd40a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calculation.sty \
texlive-calculation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-delarray.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
