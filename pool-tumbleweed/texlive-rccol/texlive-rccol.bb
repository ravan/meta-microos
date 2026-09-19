SUMMARY = "Decimal-centered optionally rounded numbers in tabular"
DESCRIPTION = "The rccol package provides decimal-centered numbers: \
corresponding digits and decimal separators aligned. \
Furthermore, rounding to the desired precision is possible. The \
package makes use of the fltpoint package (as well as the LaTeX \
required array package)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2csvn77682"

RPM_NAME = "texlive-rccol-2026.226.1.2csvn77682-60.4.noarch.rpm"
RPM_HASH = "63fe162d2194724dd0b06aa47e6fd289663c78c90056e16027a92486495f9c2175e74d4edd7790f0ffcf1e049e3b5d130b8e4b2cde2695884c3db9bcfc3ec09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rccol.sty \
texlive-rccol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-fltpoint.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
