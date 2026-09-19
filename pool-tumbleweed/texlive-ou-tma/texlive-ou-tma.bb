SUMMARY = "A package to aid in the writing of Tutor Marked Assessments for the Open University"
DESCRIPTION = "The ou-tma package simplifies the creation of TMAs (Tutor \
Marked Assessments) by providing an environment to encompass \
answers to questions, commands to enumerate parts and subparts \
of those questions, and a set of macros facilitating \
mathematical entry based on the styles used by the Open \
University (OU)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.21svn76460"

RPM_NAME = "texlive-ou-tma-2026.226.1.21svn76460-61.2.noarch.rpm"
RPM_HASH = "d4572d7adca3ecfb78caf55aa5e80cafa404d10c5a55ed894307ab5b2f920119b2d3e6574a2b0a1651a8a5d285457674fcba2b9b3716d45844add78342fe81e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ou-tma.sty \
texlive-ou-tma"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bm.sty \
tex-calc.sty \
tex-cleveref.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-isodate.sty \
tex-lastpage.sty \
tex-upgreek.sty \
tex-verbatim.sty \
tex-wasysym.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
