SUMMARY = "Draw Bode, Nyquist and Nichols plots with gnuplot or pgfplots"
DESCRIPTION = "This is a LaTeX package to plot Bode, Nichols, and Nyquist \
diagrams. It provides added functionality over the similar \
bodegraph package: New \\BodeZPK and \\BodeTF commands to \
generate Bode plots of any transfer function given either \
poles, zeros, gain, and delay, or numerator and denominator \
coefficients and delay Support for unstable poles and zeros. \
Support for complex poles and zeros. Support for general stable \
and unstable second order transfer functions. Support for both \
Gnuplot (default) and pgfplots (package option pgf). Support \
for linear and asymptotic approximation of magnitude and phase \
plots of any transfer function given poles, zeros, and gain."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.3svn77390"

RPM_NAME = "texlive-bodeplot-2026.226.3.0.3svn77390-59.2.noarch.rpm"
RPM_HASH = "f84eb5d1a0720a7f6603a5b24b35c3dfb8afcbebfe3d783f4741d26b1e41963246413860a998a0180aaa4d026457548efd9f1accf0b788fca2070fa02fc72b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bodeplot-2024-02-06.sty \
tex-bodeplot.sty \
texlive-bodeplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifplatform.sty \
tex-pdftexcmds.sty \
tex-pgfplots.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
