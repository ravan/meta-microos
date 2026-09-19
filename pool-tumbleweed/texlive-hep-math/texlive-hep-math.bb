SUMMARY = "Extended math macros"
DESCRIPTION = "The hep-math package provides some additional features beyond \
the mathtools and amsmath packages. To use the package place \
\\usepackage{hep-math} in the preamble"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-math-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "fa8ea853615744b1b5786e3a0f0210eff5c8364eea0b19e37f017b1066ab91f5c77d136fcde93d6fd3cf2c387f1158ef6474fc64a60a6708825ae6ea8b0ac273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-math.sty \
texlive-hep-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-cancel.sty \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-mleftright.sty \
tex-slashed.sty \
tex-soul.sty \
tex-units.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
