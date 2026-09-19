SUMMARY = "Inconsolata Nerd Font with support for XeLaTeX or LuaLaTeX"
DESCRIPTION = "Inconsolata is a monospaced font designed by Raph Levien. It is \
already available via the inconsolata package. However, that \
package provides a pretty old version of the font. \
Additionally, the Nerd Font project extended the font by a huge \
amount of additional glyphs. This package provides the \
Inconsolata Nerd Font in .ttf format as well as a convenient \
interface to load the font for the XeTeX and LuaTeX engines."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-inconsolata-nerd-font-2026.226.0.0.5svn77682-60.2.noarch.rpm"
RPM_HASH = "51b4dfbe21f80fb590e96d84d82c1d99a666321f6a3abe50995acec54c0b330e988311c2b9e59edea3a253b4dcabc1978ce8ccc43c439e3fa646166a84c1a3f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inconsolata-nerd-font.sty \
texlive-inconsolata-nerd-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fontspec.sty \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-inconsolata-nerd-font-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
