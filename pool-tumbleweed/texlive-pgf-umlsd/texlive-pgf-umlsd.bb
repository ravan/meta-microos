SUMMARY = "Draw UML Sequence Diagrams"
DESCRIPTION = "LaTeX macros to draw UML diagrams using pgf"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.7svn55342"

RPM_NAME = "texlive-pgf-umlsd-2026.226.0.0.7svn55342-58.2.noarch.rpm"
RPM_HASH = "f9e8f4e3b6648898f05cceefb2041044e7aed100a6ccfaa9b12975a6d6b475a06db55e94a6e47a2ae8b94e241d843daf2cc9902a010943f456924a65115dfe2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgf-umlsd.sty \
texlive-pgf-umlsd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
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
