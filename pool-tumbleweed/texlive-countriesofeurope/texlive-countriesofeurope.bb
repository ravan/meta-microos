SUMMARY = "A font with the images of the countries of Europe"
DESCRIPTION = "The bundle provides a font 'CountriesOfEurope' (in Adobe Type 1 \
format) and the necessary metrics, together with LaTeX macros \
for its use. The font provides glyphs with a filled outline of \
the shape of each country; each glyph is at the same \
cartographic scale."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.23svn77682"

RPM_NAME = "texlive-countriesofeurope-2026.226.0.0.23svn77682-61.2.noarch.rpm"
RPM_HASH = "470832fe28b40e43a6c1498ba503ebe99a8fc7771c699ad31ef0abdb005363edbe6d519a2b08fa87aae8e0bb28e0e0329a3410bcea3de20b215a9b57e45f5a9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-countriesofeurope.enc \
tex-countriesofeurope.map \
tex-countriesofeurope.sty \
tex-countriesofeurope.tfm \
texlive-countriesofeurope"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-countriesofeurope-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
