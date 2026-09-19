SUMMARY = "OpenType versions of the kpfonts (Type1) designed by Christophe Caignaert"
DESCRIPTION = "This bundle provides OpenType versions of the Type1 Kp-fonts \
designed by Christophe Caignaert. It is usable with LuaTeX or \
XeTeX engines only. It consists of sixteen Text fonts (eight \
Serif, four Sans-Serif, four Monotype) and six Math fonts. \
Serif and Sans-Serif families have small caps available in two \
sizes (SmallCaps and PetitesCaps), upper and lowercase digits, \
real superscripts and subscripts; ancient ligatures (ct and \
st), ancient long-s and a long-tailed capital Q are available \
via font features. Math fonts cover all usual symbols including \
AMS'; a full list of available symbols is provided, see the \
'List of glyphs'."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.72svn77917"

RPM_NAME = "texlive-kpfonts-otf-2026.226.0.0.72svn77917-63.2.noarch.rpm"
RPM_HASH = "940a88f1ef6e3677aae51e9305881ffc22f488d1b51c29feeddcf4a01e2c136e217edc04550412d29bb0679e43516847e6a936d677e053b0d70c5423981fb862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kpfonts-otf.sty \
texlive-kpfonts-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-realscripts.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-kpfonts-otf-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
