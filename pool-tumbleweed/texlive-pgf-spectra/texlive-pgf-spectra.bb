SUMMARY = "Draw continuous or discrete spectra using PGF/TikZ"
DESCRIPTION = "The purpose of this package is to draw the spectrum of elements \
in a simple way. It relies on PGF/TikZ to draw the desired \
spectrum, continuous or discrete. Data for the spectra of 98 \
elements and their ions are available (from the NASA database \
and from NIST). Lines data ranges from Extreme UV to Near IR \
(from 10 to 4000 nanometers). It also allows the user to draw \
spectra using their own data. It is possible to redshift the \
lines of a spectrum, by directly entering the redshift value or \
the velocity and the angle to compute the redshift value. \
Spectral lines data can be presented in a table or exported to \
a file. The package also provides color conversion (correlated \
color temperature), shadings for use with TikZ and/or pgfplots \
and color maps for use with pgfplots."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.2svn75535"

RPM_NAME = "texlive-pgf-spectra-2026.226.3.0.2svn75535-58.2.noarch.rpm"
RPM_HASH = "eed9e072ffd62e058a5fbdd065ce3527f4514c0cec252f13278d11c4b8e6f322b04989e489813257f5dbe93f645610eb79ae1f9133ba9111372e5591af8bf726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-spectra.data.LSE.tex \
tex-pgf-spectra.data.NIST.tex \
tex-pgf-spectra.input.library.tex \
tex-pgf-spectra.library.data.tex \
tex-pgf-spectra.library.pgfplots.tex \
tex-pgf-spectra.library.rainbow.tex \
tex-pgf-spectra.library.tempercolor.tex \
tex-pgf-spectra.sty \
texlive-pgf-spectra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
