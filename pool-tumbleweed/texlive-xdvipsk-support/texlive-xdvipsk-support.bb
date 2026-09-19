SUMMARY = "LuaLaTeX packages for the xdvipsk binary (dvips extension)"
DESCRIPTION = "This LaTeX package bundle offers support for xdvipsk, an \
extension of the dvips binary. xdvipsk supports BMP, PCX, TIFF, \
JPEG, and PNG formats and performs scaling, rotating, trim, and \
viewport operations like EPS images. The xdvispk.def driver for \
the graphics package offers a LaTeX interface. However, it \
lacks clipping, trimming, and viewport operations. The LuaLaTeX \
package xdvipskmaps provides OpenType font support for xdvipsk. \
It generates map files containing information about OpenType \
fonts used in DVI files."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77772"

RPM_NAME = "texlive-xdvipsk-support-2026.226.1.0svn77772-59.4.noarch.rpm"
RPM_HASH = "654a6268c98095912ff62e5a05c78a45c666dcfaa86c61f96d0fdf0be8cb1b7c7c467cdc30b255aaab28e8be0fb2c0a6f3beb534cc0911a4662006524c6800dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xdvipsk-support.sty \
tex-xdvipsk.def \
tex-xdvipskmaps.sty \
texlive-xdvipsk-support"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-luatexbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xdvipsk"

inherit rpm
