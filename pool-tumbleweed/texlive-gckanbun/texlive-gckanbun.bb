SUMMARY = "Kanbun typesetting for (u)pLaTeX and LuaLaTeX"
DESCRIPTION = "This package provides a Kanbun (Han Wen , 'Chinese writing') \
typesetting for (u)pLaTeX and LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.7svn77307"

RPM_NAME = "texlive-gckanbun-2026.226.2.2.7svn77307-60.2.noarch.rpm"
RPM_HASH = "3801d0557b9aa144bd0e46d5e56cbb75c9067a31fc3e11f2bc675d3749bdf607113813b563797052e2b64f88e1f4bafdffc42406e15e669d421d93b6c06c52dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gckanbun.sty \
texlive-gckanbun"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bxghost.sty \
tex-etoolbox.sty \
tex-ifluatex.sty \
tex-ifuptex.sty \
tex-keyval.sty \
tex-luatexja-adjust.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
