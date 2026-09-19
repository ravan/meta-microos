SUMMARY = "Easy addition of wallpapers (background images) to LaTeX documents, including tiling"
DESCRIPTION = "This collection contains files to add wallpapers (background \
images) to LaTeX documents. It uses the eso-pic package, but \
provides simple commands to include effects such as tiling. An \
example is provided, which works under both LaTeX and pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn77682"

RPM_NAME = "texlive-wallpaper-2026.226.1.10svn77682-60.2.noarch.rpm"
RPM_HASH = "e4b2ea5fc05365e4d456f2cf142dda9f4ec71816b7480fb64edd39b7f9597a7a5a365525103e0e28765e7d8d8fb2a7fe057f792384162a52c43033d51b653277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wallpaper.sty \
texlive-wallpaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-eso-pic.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
