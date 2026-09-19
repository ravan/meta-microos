SUMMARY = "Typesetting herbarium specimen labels"
DESCRIPTION = "This package provides a LaTeX class nanicolle.cls for \
typesetting collection labels and identification labels in \
Chinese style or in western style for plant herbarium \
specimens. So far, documents using this class can only be \
compiled with XeLaTeX. Note: The name of the package is a \
compound of the Japanese 'nani' (meaning 'what') and a \
truncated form of the English 'collect', thus expressing the \
ideas of identification/classification (taxonomy) and \
collection."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.03ysvn56224"

RPM_NAME = "texlive-nanicolle-2026.226.2.03ysvn56224-61.2.noarch.rpm"
RPM_HASH = "11cccf07753085b50386966a666c8d062c4d4ba9214240eaf1c4b923b62f6ef920d42617144657a425a2eca5be8dc0233f1ee9bd3eae93b896f09f65c426d7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nanicolle.cls \
texlive-nanicolle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-color.sty \
tex-ctexart.cls \
tex-geometry.sty \
tex-graphicx.sty \
tex-listofitems.sty \
tex-makebarcode.sty \
tex-multicol.sty \
tex-qrcode.sty \
tex-rulerbox.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
