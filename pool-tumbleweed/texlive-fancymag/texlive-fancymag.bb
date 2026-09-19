SUMMARY = "A LuaLaTeX package for academic magazines and scientific"
DESCRIPTION = "fancymag is a LaTeX package designed to provide enhanced \
typographic styling for academic and editorial documents. It \
integrates a selection of freely licensed display fonts to help \
authors create visually appealing layouts for magazines, \
scientific books, and other publication-quality material. The \
package must be compiled with LuaLaTeX and depends on OpenType \
fonts included in the package. To function correctly, the \
accompanying fonts/ and img/ directories must be present, as \
described in the documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75720"

RPM_NAME = "texlive-fancymag-2026.226.1.0svn75720-59.2.noarch.rpm"
RPM_HASH = "af9042e3d4868aaa69451f2a0ec4cf4f4fa5fd2bf436033b60bae4823916726769bacde0cf3de2921e9315dd78417edded893dfab5c9b18a693460ad2fa58d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancymag.sty \
texlive-fancymag"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-afterpage.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-balance.sty \
tex-calligra.sty \
tex-caption.sty \
tex-eso-pic.sty \
tex-everypage-1x.sty \
tex-fancyhdr.sty \
tex-fix-cm.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-lettrine.sty \
tex-lipsum.sty \
tex-multicol.sty \
tex-pdfrender.sty \
tex-shadowtext.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
