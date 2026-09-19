SUMMARY = "PoiretOne family of fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the PoiretOne family of fonts, designed by Denis \
Masharov. PoiretOne is a decorative geometric grotesque with a \
hint of Art Deco and constructivism. There is currently just a \
regular weight and an artificially emboldened bold."
LICENSE = "OFL-1.1"

PV = "2026.226.svn64856"

RPM_NAME = "texlive-poiretone-2026.226.svn64856-59.2.noarch.rpm"
RPM_HASH = "f083b7732b2f90838d617010d13b71da329c885d3bd3e3f11e481f6e54a57f2813d23f850b47207e7b7e23f7e0471464f5d43a5c0d0b1b1f134eae892cbb5e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1PoiretOne-LF.fd \
tex-OT1PoiretOne-LF.fd \
tex-PoiretOne-Bold-lf-ly1--base.tfm \
tex-PoiretOne-Bold-lf-ly1.tfm \
tex-PoiretOne-Bold-lf-ly1.vf \
tex-PoiretOne-Bold-lf-ot1.tfm \
tex-PoiretOne-Bold-lf-t1--base.tfm \
tex-PoiretOne-Bold-lf-t1.tfm \
tex-PoiretOne-Bold-lf-t1.vf \
tex-PoiretOne-Bold-lf-ts1--base.tfm \
tex-PoiretOne-Bold-lf-ts1.tfm \
tex-PoiretOne-Bold-lf-ts1.vf \
tex-PoiretOne-Regular-lf-ly1--base.tfm \
tex-PoiretOne-Regular-lf-ly1.tfm \
tex-PoiretOne-Regular-lf-ly1.vf \
tex-PoiretOne-Regular-lf-ot1.tfm \
tex-PoiretOne-Regular-lf-t1--base.tfm \
tex-PoiretOne-Regular-lf-t1.tfm \
tex-PoiretOne-Regular-lf-t1.vf \
tex-PoiretOne-Regular-lf-ts1--base.tfm \
tex-PoiretOne-Regular-lf-ts1.tfm \
tex-PoiretOne-Regular-lf-ts1.vf \
tex-PoiretOne.map \
tex-PoiretOne.sty \
tex-T1PoiretOne-LF.fd \
tex-TS1PoiretOne-LF.fd \
tex-prtn-2rdbwn.enc \
tex-prtn-bjsotj.enc \
tex-prtn-nt5tbh.enc \
tex-prtn-opucty.enc \
texlive-poiretone"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-mweights.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-poiretone-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
