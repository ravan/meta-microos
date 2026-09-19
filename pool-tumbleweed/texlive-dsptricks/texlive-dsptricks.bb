SUMMARY = "Macros for Digital Signal Processing plots"
DESCRIPTION = "The package provides a set of LaTeX macros (based on PSTricks) \
for plotting the kind of graphs and figures that are usually \
employed in digital signal processing publications. DSPTricks \
provides facilities for standard discrete-time 'lollipop' \
plots, continuous-time and frequency plots, and pole-zero \
plots. The companion package DSPFunctions (dspfunctions.sty) \
provides macros for computing frequency responses and DFTs, \
while the package DSPBlocks (dspblocks.sty) supports DSP block \
diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn68753"

RPM_NAME = "texlive-dsptricks-2026.226.1.1svn68753-59.2.noarch.rpm"
RPM_HASH = "e21b00fe8084f284fa807ccc51d71b9be00df3dfc9baec5fee5aa69397a01a802d227c18555de1ff31b56cc7d148acf537749e7d5caf7ada8d83d1b3a287f210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dspblocks.sty \
tex-dspfunctions.sty \
tex-dsptricks.sty \
texlive-dsptricks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fmtcount.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-pst-xkey.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
