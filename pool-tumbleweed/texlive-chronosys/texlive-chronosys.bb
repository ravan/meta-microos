SUMMARY = "Drawing time-line diagrams"
DESCRIPTION = "Macros to produce time line diagrams. Interfaces for Plain TeX, \
ConTeXt and LaTeX are provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn26700"

RPM_NAME = "texlive-chronosys-2026.226.1.2svn26700-60.2.noarch.rpm"
RPM_HASH = "3fb83e59de8695d6ec7cf6f680966ed0161ede55dbcba3cab8692dd52f416998b17acb0a870bd05b7a30bcabe9d30721f937308f9a6f0c87104b61c91f24a5da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chronosys.sty \
tex-chronosys.tex \
tex-chronosyschr.tex \
tex-x-chronosys.tex \
texlive-chronosys"

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
