SUMMARY = "Decorated text boxes using TikZ"
DESCRIPTION = "This simple package provides four types of text decorations \
using TikZ. You can frame your text with circles, rectangles, \
jagged rectangles, and fan-shapes. The baseline will be \
adjusted properly according to the surroundings. You can use \
these decorations both in text mode and in math mode. You can \
specify line color, line width, width, and height using option \
keys. Note: The 'DP' in the package name stands for 'Decorated \
Packets'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn54994"

RPM_NAME = "texlive-dpcircling-2026.226.1.0svn54994-59.2.noarch.rpm"
RPM_HASH = "7da18f3b4f25e280122bcf6708551abe663f6e92bd610293539da28d0542dde40465855e3b066d7ac50d9ec58ac986e4b8402d2865ccec656693cf33522aa1a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-DPcircling.sty \
texlive-dpcircling"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
