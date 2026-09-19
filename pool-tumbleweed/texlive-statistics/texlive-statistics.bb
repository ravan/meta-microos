SUMMARY = "Compute and typeset statistics tables and graphics"
DESCRIPTION = "The 'statistics' package can compute and typeset statistics \
like frequency tables, cumulative distribution functions \
(increasing or decreasing, in frequency or absolute count \
domain), from the counts of individual values, or ranges, or \
even the raw value list with repetitions. It can also compute \
and draw a bar diagram in case of individual values, or, when \
the data repartition is known from ranges, an histogram or the \
continuous cumulative distribution function. You can ask \
'statistics' to display no result, selective results or all of \
them. Similarly 'statistics' can draw only some parts of the \
graphs. Every part of the generated tables or graphics is \
customizable."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.2svn67201"

RPM_NAME = "texlive-statistics-2026.226.2.2svn67201-64.2.noarch.rpm"
RPM_HASH = "9f2188786b55f6f5298865b0896456792f137050bb9df0af5a845cee71d742e8996e1ad5a0d55b15cb4276cd5d2f41108b45795a9960acab49c0ff79123f3fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-statistics.sty \
texlive-statistics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-expl3.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
