SUMMARY = "U.S. Patent Application Tools for LaTeX and LyX"
DESCRIPTION = "The package provides a class and other tools for developing a \
beautifully formatted, consistent U.S. Patent Application using \
LaTeX and/or LyX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn27744"

RPM_NAME = "texlive-uspatent-2026.226.1.0svn27744-60.2.noarch.rpm"
RPM_HASH = "6f09badb8ffe08546c57614f24d4e169b136b68bbed0c5a39c7ef86be94d89782e4ec4d246ed1a17434cf30ef7964b902094946f3a17e2e5c99cd07d6a3dc5ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uspatent.cls \
texlive-uspatent"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-acronym.sty \
tex-amsmath.sty \
tex-babel.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-lmodern.sty \
tex-memhfixc.sty \
tex-memoir.cls \
tex-prettyref.sty \
tex-tikz.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
