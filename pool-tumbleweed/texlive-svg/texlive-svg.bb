SUMMARY = "Include and extract SVG pictures in LaTeX documents"
DESCRIPTION = "This bundle contains the two packages svg and svg-extract. The \
svg package is intended for the automated integration of SVG \
graphics into LaTeX documents. Therefore the capabilities \
provided by Inkscape -- or more precisely its command line tool \
-- are used to export the text within an SVG graphic to a \
separate file, which is then rendered by LaTeX. For this \
purpose the two commands \\includesvg and \\includeinkscape are \
provided which are very similar to the \\includegraphics command \
of the graphicx package. In addition, the package svg-extract \
allows the extraction of these graphics into independent files \
in different graphic formats, exactly as it is rendered within \
the LaTeX document, using either ImageMagick or Ghostscript."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.02ksvn77682"

RPM_NAME = "texlive-svg-2026.226.2.02ksvn77682-64.2.noarch.rpm"
RPM_HASH = "d66493e421d8f3d69a65a8fbbc1e8706f60fd58e3c4417a10ea93cbd78e28f1f1fa16adeea7b642dcedf585f1444a924a9fa62fae54185f367915be4cb917931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svg-extract.sty \
tex-svg.sty \
texlive-svg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifplatform.sty \
tex-iftex.sty \
tex-pdftexcmds.sty \
tex-pgfsys.sty \
tex-scrbase.sty \
tex-shellesc.sty \
tex-transparent.sty \
tex-trimspaces.sty \
tex-xcolor.sty \
tex-xr.sty \
texlive \
texlive-filesystem \
texlive-graphics \
texlive-iftex \
texlive-koma-script \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdftexcmds \
texlive-scripts \
texlive-scripts-bin \
texlive-tools \
texlive-trimspaces"

inherit rpm
