SUMMARY = "Visual debugging with LuaLaTeX"
DESCRIPTION = "The package uses lua code to provide visible indications of \
boxes, glues, kerns and penalties in the PDF output. The \
package is known to work in LaTeX and Plain TeX documents."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77803"

RPM_NAME = "texlive-lua-visual-debug-2026.226.1.0svn77803-59.2.noarch.rpm"
RPM_HASH = "3d2b7a91e28a38756609b2bc98ab1515117c376ca2cc37b5dd130c3c4abf0a73fdbc28106843b27753c27a1ed298ba8bf3302eb7c54d4f21bd9c10f76158eba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lua-visual-debug.sty \
texlive-lua-visual-debug"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luakeyval \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
