SUMMARY = "Upright brackets in emphasised text"
DESCRIPTION = "The package redefines the commands \\emph and \\textit so that \
parentheses and square brackets are typeset in an upright font \
in their arguments. The package requires expl3 from the \
l3kernel bundle, and xparse and l3keys2e from the l3packages \
bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9asvn77682"

RPM_NAME = "texlive-embrac-2026.226.0.0.9asvn77682-61.4.noarch.rpm"
RPM_HASH = "3daf1d3e3eed7eb6dac81fb761c02f11d15d42b85eda8f6dc64ac771881a912b40f34dc1f6570dbd5fdcee71952d8106b12e42c21900117b0dd6390999632a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-embrac.sty \
texlive-embrac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
