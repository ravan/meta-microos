SUMMARY = "A comprehensive Bangla LaTeX package"
DESCRIPTION = "This package provides all the necessary LaTeX frontends for the \
Bangla language and comes with some fonts of its own."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn76924"

RPM_NAME = "texlive-bangla-2026.226.2.1svn76924-60.2.noarch.rpm"
RPM_HASH = "8a1a749f1df84e0031ee129fdc67a4f345c59adfe076f17a0a9f5a9c4a424f41e420122acf8e43c4ad159509c727e709730c471308ba4034cbefb77e217d0d28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bangla.sty \
tex-banglamap.tex \
texlive-bangla"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CharisSIL.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-polyglossia.sty \
texlive \
texlive-bangla-fonts \
texlive-charissil \
texlive-doulossil \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
