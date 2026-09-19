SUMMARY = "Colour and graphics option files"
DESCRIPTION = "This bundle is a combined distribution consisting of dvips.def, \
pdftex.def, luatex.def, xetex.def, dvipdfmx.def, and \
dvisvgm.def driver option files for the LaTeX graphics and \
color packages. It is hoped that by combining their source \
repositories at https://github.com/latex3/graphics-def it will \
be easier to coordinate updates."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76719"

RPM_NAME = "texlive-graphics-def-2026.226.svn76719-60.4.noarch.rpm"
RPM_HASH = "05e5c7b9e4083b5d0d100de6967a59ba9db51e367a1df2e98de65f051cc739b98956905e55510f57408c397031a3798f1815ff1c1799602f5cc18bfd96d38490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dvipdfmx.def \
tex-dvips.def \
tex-dvisvgm.def \
tex-luatex.def \
tex-pdftex.def \
tex-xetex.def \
texlive-graphics-def"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epstopdf-base.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
