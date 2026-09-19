SUMMARY = "TikZ-based package for drawing customisable timelines with support for colour schemes, styles and memoization"
DESCRIPTION = "The package supports drawing timelines and aims to be highly \
customisable. Extensive configuration options are offered via a \
standard key-value interface based on pgfkeys. Custom colour \
schemes and styles are supported, and the package includes \
documented examples of each. Memoization works out-of-the-box \
if the memoize package is loaded. The code was developed as a \
result of questions concerning difficulties in customising the \
output of existing packages for drawing timelines, which \
sometimes eschew pgfkeys and are often challenging to \
configure, even when based on PGF/TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.3svn76924"

RPM_NAME = "texlive-chronos-2026.226.0.0.9.3svn76924-60.2.noarch.rpm"
RPM_HASH = "f2f27ed7f598010bd6f18031fc2a12fa7b046feeaf16f570192f21bad0a155866d368159d9dcbab268fc6e535d1bc185d93a93294d154802a4d6ffa9008680d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chronos-lib-colschemes.sty \
tex-chronos-lib-styles.sty \
tex-chronos.sty \
texlive-chronos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fp.sty \
tex-l3keys2e.sty \
tex-pgfcalendar.sty \
tex-svn-prov.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
