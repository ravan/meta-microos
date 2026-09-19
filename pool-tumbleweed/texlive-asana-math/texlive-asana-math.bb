SUMMARY = "A font to typeset maths in Xe(La)TeX and Lua(La)TeX"
DESCRIPTION = "The Asana-Math font is an OpenType font that includes almost \
all mathematical Unicode symbols and it can be used to typeset \
mathematical text with any software that can understand the \
MATH OpenType table (e.g., XeTeX 0.997 and Microsoft Word \
2007). The font is beta software. Typesetting support for use \
with LaTeX is provided by the fontspec and unicode-math \
packages."
LICENSE = "OFL-1.1"

PV = "2026.226.0.000.962svn76895"

RPM_NAME = "texlive-asana-math-2026.226.0.000.962svn76895-60.2.noarch.rpm"
RPM_HASH = "83623facbd67683cebec8ba29fb9b0d21b73210d7ae3cde8f6839e321c4fe3dbf5024034c070990916f2455c4db594361a65500db14a7f9a982caf4bacb0fec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asana-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-asana-math-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
