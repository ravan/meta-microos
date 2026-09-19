SUMMARY = "Open Type font by Andrij Shevchenko"
DESCRIPTION = "In 2011 Andrij's typeface became a winner of the Ukrainian Type \
Design Competition 'Mystetsky Arsenal' in which three main \
criteria were sought for: being zeitgeist, practical, and \
Ukrainian. Andrij's winning entry was crowned Arsenal and made \
publicly available. Arsenal is a semi-grotesque with \
traditional forms. It is primarily designed for body text and \
intended for various professional communication. Its special \
qualities of letter shapes and subtle contrast modulation \
articulate grace and expressivity. Arsenal's somewhat lyrical \
sentiment abides to the Ukrainian nature of the font. This \
package provides the fonts and LaTeX support for them with \
matching math. It needs LuaLaTeX or XeLaTeX."
LICENSE = "OFL-1.1"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-arsenal-2026.226.1.1svn77682-60.2.noarch.rpm"
RPM_HASH = "13adc78a7818bb250c114d6e6cb2f488ff6a54cea5c2a2cf55a0a0497276759ad4656bef447e5dff7619a5caaea737b2b8c806d37da88656bb4bb328f547f3e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arsenal.sty \
texlive-arsenal"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-arsenal-math.sty \
tex-fontspec.sty \
tex-l3keys2e.sty \
texlive \
texlive-arsenal-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
