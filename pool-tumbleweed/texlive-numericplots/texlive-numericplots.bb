SUMMARY = "Plot numeric data (including Matlab export) using PSTricks"
DESCRIPTION = "Plotting numeric data is a task which has often to be done for \
scientific papers. LaTeX itself provides no facilities for \
drawing more than the simplest plots from supplied data. The \
package will process user input, and uses PSTricks to plot the \
results. The package provides Matlab functions to transform \
Matlab results to plottable data."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0.2svn31729"

RPM_NAME = "texlive-numericplots-2026.226.2.0.2svn31729-61.2.noarch.rpm"
RPM_HASH = "40bef923c3c00d93c24874864338fc500fb85c02dcd4511ea249708b7751b28082466b7d858593ad5591e8753951368af00cd26c0c50885ea6fc3bc147f3c471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-NumericPlots-TickLabels.tex \
tex-NumericPlots-labels.tex \
tex-NumericPlots-legend.tex \
tex-NumericPlots-macros.tex \
tex-NumericPlots-styles.tex \
tex-NumericPlots.sty \
texlive-numericplots"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xkvview.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
