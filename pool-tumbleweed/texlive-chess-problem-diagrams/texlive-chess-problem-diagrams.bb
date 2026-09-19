SUMMARY = "A package for typesetting chess problem diagrams"
DESCRIPTION = "This package provides macros to typeset chess problem diagrams \
including fairy chess problems (mostly using rotated images of \
pieces) and other boards."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.23svn78101"

RPM_NAME = "texlive-chess-problem-diagrams-2026.226.1.23svn78101-60.2.noarch.rpm"
RPM_HASH = "527b9337b50017a4426dfd0b2509b00905bfec5c8eaeb0ab17443baf6f912a80bbc2efcbe68a818c8883320272be0297a8e5c14f95090fc6ffe2c4c43efb27d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cpdparse.sty \
tex-diagram.sty \
texlive-chess-problem-diagrams"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
