SUMMARY = "Display cistercian numerals"
DESCRIPTION = "A TikZ-based package to display cistercian numerals. After \
loading the package, the macro \\cistercian{<number>} can be \
used to display cistercian numerals. The numerals can be \
customised via TikZ options."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn77682"

RPM_NAME = "texlive-cistercian-2026.226.0.0.6svn77682-60.2.noarch.rpm"
RPM_HASH = "48ccee24370c38dc086ecec9a1ea3f4b9d66f84668aad6f5fe31c389b702094b887bd8986bd1f800487c840f7a8840f2756adc8c651a21726b1ecbc46b8e501f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cistercian.sty \
texlive-cistercian"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-BusyPanda.sty \
tex-etoolbox.sty \
tex-tikz.sty \
texlive \
texlive-epstopdf-pkg \
texlive-filesystem \
texlive-iftex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
