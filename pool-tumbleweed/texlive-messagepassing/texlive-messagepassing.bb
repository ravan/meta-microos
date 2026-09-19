SUMMARY = "Draw diagrams to represent communication protocols"
DESCRIPTION = "This package provides an environment to easily draw diagrams to \
represent communication protocols using message passing among \
processes. Processes are represented as horizontal or vertical \
lines, and communications as arrows between lines. The package \
also provides multiple macros to decorate those diagrams, for \
instance to annotate the diagram, to add crashes to the \
processes, checkpoints, ..."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn69123"

RPM_NAME = "texlive-messagepassing-2026.226.1.2svn69123-61.2.noarch.rpm"
RPM_HASH = "bc7555f0d15b4b14cc461475d1de3bb7da9713ed5e291c793a3c9dcb60d67b7f6259252667e8963493383b47daea43b886f310f2f2dd6b334c576ddb92cd7c03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-messagepassing.sty \
texlive-messagepassing"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
