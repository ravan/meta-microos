SUMMARY = "Extended TeX logo macros"
DESCRIPTION = "This package exposes spacing parameters for various TeX logos \
to the end user, to optimise the logos for different fonts. \
Written especially for XeLaTeX users."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12svn77682"

RPM_NAME = "texlive-metalogo-2026.226.0.0.12svn77682-61.2.noarch.rpm"
RPM_HASH = "d651f91172eeffc3e568c802de77807debafe8022a1b8dec0d7de200e2caee5276e51ad257ed38d96eb3696b57dd73cbe7d053b2f5c419402cd58d2d30d132fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metalogo.sty \
texlive-metalogo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-graphicx.sty \
tex-ifxetex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
