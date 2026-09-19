SUMMARY = "A LaTeX based calendar using TikZ"
DESCRIPTION = "For usage see the example files tikz-kalender-example1.tex, \
tikz-kalender-example2.tex, tikz-kalender-example3.tex, and \
*.events. The Code is inspired by this document and is subject \
to the >>Creative Commons attribution license (CC-BY-SA)<<. The \
class tikz-kalender requires the package TikZ and the TikZ \
libraries calc and calendar."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6bsvn77915"

RPM_NAME = "texlive-tikz-kalender-2026.226.0.0.6bsvn77915-59.2.noarch.rpm"
RPM_HASH = "f796018282c6c21a7dd832817aadbee5c7b551bf24e1c03282bc15e58831157605509e58cefe2a21e37eac555c699945510f090c314039ba998acedfe7b97208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-kalender-translation.clo \
tex-tikz-kalender.cls \
texlive-tikz-kalender"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-lmodern.sty \
tex-pgfkeys.sty \
tex-ragged2e.sty \
tex-textcomp.sty \
tex-tgheros.sty \
tex-tikz.sty \
tex-translator.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
