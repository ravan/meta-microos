SUMMARY = "Shortcuts commands to symbols used in probability texts"
DESCRIPTION = "This package includes some of the most often used commands in \
probability texts, e.g. probability, expectation, variance, \
etc. It also includes some short commands for set (blackboard) \
or filtrations (calligraphic). It requires LaTeX2e and the \
amsfonts package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-proba-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "e3ce9665554900567b358e712e289a77f7dc0df0ba98863af14a78676adcbaf077af08489330fb502b20ee9742762718ac45a0fb9c2f3de6e8f6383d3272c8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-proba.sty \
texlive-proba"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
