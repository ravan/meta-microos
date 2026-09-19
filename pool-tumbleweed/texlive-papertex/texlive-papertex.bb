SUMMARY = "Class for newspapers, etcetera"
DESCRIPTION = "This class allows LaTeX users to create a paperTeX newspaper. \
The final document has a front page and as many inner pages as \
desired. News items appear one after another and the user can \
choose the number of columns, style and so on. The class allows \
users to create newsletters too."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2bsvn75878"

RPM_NAME = "texlive-papertex-2026.226.1.2bsvn75878-58.2.noarch.rpm"
RPM_HASH = "4cae1d8749d6bdf88e0a0c145db205b8d7cad3e59b6df8edb45adc67da217b4d3ced0a18cf3d731b97bb747cccf02383a7edf5e5d09e0ced8a6a5b27c52e1d68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-papertex.cls \
texlive-papertex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-color.sty \
tex-datetime.sty \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-lastpage.sty \
tex-multicol.sty \
tex-multido.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-textpos.sty \
tex-wrapfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
