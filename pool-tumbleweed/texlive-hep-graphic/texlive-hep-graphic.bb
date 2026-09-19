SUMMARY = "Extensions for graphics, plots and feynman graphs in high energy physics"
DESCRIPTION = "The hep-graphic package collects convenience macros that modify \
the behaviour of the TikZ, pgfplots, and TikZ-Feynman packages \
and ensure that the generated graphics look consistent."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76790"

RPM_NAME = "texlive-hep-graphic-2026.226.1.4svn76790-60.4.noarch.rpm"
RPM_HASH = "e8abc62ab7829784f0b9d9c22af02b57e214a3ee8cf702dfd7e062c79f4985069443343011d7007342d5ecef9011cedf5fd70167a1fc985bae9d5cddf174ab74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-feynman.sty \
tex-hep-graphic.sty \
tex-hep-plot.sty \
texlive-hep-graphic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-pgfplots.sty \
tex-tikz-feynman.sty \
tex-tikz.sty \
tex-tikzscale.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
