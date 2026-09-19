SUMMARY = "Some LaTeX macros for UML Class Diagrams"
DESCRIPTION = "Some LaTeX macros for UML Class Diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.3svn63386"

RPM_NAME = "texlive-pgf-umlcd-2026.226.0.0.3svn63386-58.2.noarch.rpm"
RPM_HASH = "59a7fafde9a376c55b3a61b75093ee7e86e1ef5c5d2a427a519b67435b47c0e17642f2634524d232c7740ade3b676302f8479a7217984451169b02680a85b75d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-umlcd.sty \
tex-tikzlibraryumlcd.code.tex \
texlive-pgf-umlcd"

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
texlive-latex \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
