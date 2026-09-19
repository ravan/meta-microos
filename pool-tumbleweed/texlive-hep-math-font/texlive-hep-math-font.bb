SUMMARY = "Extended Greek and sans-serif math"
DESCRIPTION = "The hep-math-font package adjust the math fonts to be \
sans-serif if the document is sans-serif. Additionally Greek \
letters are redefined to be always italic and upright in math \
and text mode respectively. Some math font macros are adjusted \
to give more consistently the naively expected results. The \
package is loaded with \\usepackage{hep-math-font}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-math-font-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "0e31c1fce29b76ce818ae1250e69c85ce618e2c5beb13e3918c82ea5c3840bf9381b23d048f9919e5fb92c489293f44bb21f5b45da72943804f7c301de82d23d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-math-font.sty \
texlive-hep-math-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-MnSymbol.sty \
tex-alphabeta.sty \
tex-amssymb.sty \
tex-amstext.sty \
tex-bm.sty \
tex-exscale.sty \
tex-fixmath.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-pdftexcmds.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
