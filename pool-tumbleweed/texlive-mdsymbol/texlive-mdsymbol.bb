SUMMARY = "Symbol fonts to match Adobe Myriad Pro"
DESCRIPTION = "The package provides a font of mathematical symbols, MyriadPro \
The font is designed as a companion to Adobe Myriad Pro, but it \
might also fit well with other contemporary typefaces."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.5svn77682"

RPM_NAME = "texlive-mdsymbol-2026.226.0.0.5svn77682-59.2.noarch.rpm"
RPM_HASH = "32426a0ed113744cc516ecbb909970b006aafd6af54826539725da3bda2bfc966aeb4965386fc8c31134cee0f77578e94f72acccac2731d79395bd4a4189921e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-MdSymbolA-Bold.tfm \
tex-MdSymbolA-Light.tfm \
tex-MdSymbolA-Regular.tfm \
tex-MdSymbolA-Semibold.tfm \
tex-MdSymbolB-Bold.tfm \
tex-MdSymbolB-Light.tfm \
tex-MdSymbolB-Regular.tfm \
tex-MdSymbolB-Semibold.tfm \
tex-MdSymbolC-Bold.tfm \
tex-MdSymbolC-Light.tfm \
tex-MdSymbolC-Regular.tfm \
tex-MdSymbolC-Semibold.tfm \
tex-MdSymbolD-Bold.tfm \
tex-MdSymbolD-Light.tfm \
tex-MdSymbolD-Regular.tfm \
tex-MdSymbolD-Semibold.tfm \
tex-MdSymbolE-Bold.tfm \
tex-MdSymbolE-Light.tfm \
tex-MdSymbolE-Regular.tfm \
tex-MdSymbolE-Semibold.tfm \
tex-MdSymbolF-Bold.tfm \
tex-MdSymbolF-Light.tfm \
tex-MdSymbolF-Regular.tfm \
tex-MdSymbolF-Semibold.tfm \
tex-mdsymbol-a.enc \
tex-mdsymbol-b.enc \
tex-mdsymbol-c.enc \
tex-mdsymbol-d.enc \
tex-mdsymbol-e.enc \
tex-mdsymbol-f.enc \
tex-mdsymbol.map \
tex-mdsymbol.sty \
texlive-mdsymbol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-calc.sty \
tex-etoolbox.sty \
tex-fltpoint.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mdsymbol-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
