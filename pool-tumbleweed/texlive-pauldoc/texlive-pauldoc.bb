SUMMARY = "German LaTeX package documentation"
DESCRIPTION = "The package provides helpers for German language package \
documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn16005"

RPM_NAME = "texlive-pauldoc-2026.226.0.0.5svn16005-58.2.noarch.rpm"
RPM_HASH = "bb854a55aef2fe7398ae3a67b628e0d7bb5736f4b9f596d1b96da799c75997130af59a10cacab957ca2bc6735fef3e159b7c435cea0395e78d2d8665441bbab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pauldoc.sty \
texlive-pauldoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontenc.sty \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
