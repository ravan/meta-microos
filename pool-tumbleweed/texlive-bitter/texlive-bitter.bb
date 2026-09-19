SUMMARY = "The Bitter family of fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX, and LuaLaTeX \
support for the Bitter family of fonts, designed by Sol Matas \
for Huerta Tipografica. Bitter is a contemporary slab-serif \
typeface for text. There are regular and bold weights and an \
italic, but no bold italic."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-bitter-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "cb0b77eb6dfd7bc30cfe3fd289cb1769e57896bf8e7b32bfcfcd140da69184159add6191a8e9f9878562bb22cd23332c5e536028b3167701c481cc09b05bfee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Bttr-Bold-tlf-ly1--base.tfm \
tex-Bttr-Bold-tlf-ly1.tfm \
tex-Bttr-Bold-tlf-ly1.vf \
tex-Bttr-Bold-tlf-ot1.tfm \
tex-Bttr-Bold-tlf-t1--base.tfm \
tex-Bttr-Bold-tlf-t1.tfm \
tex-Bttr-Bold-tlf-t1.vf \
tex-Bttr-Bold-tlf-ts1--base.tfm \
tex-Bttr-Bold-tlf-ts1.tfm \
tex-Bttr-Bold-tlf-ts1.vf \
tex-Bttr-Italic-tlf-ly1--base.tfm \
tex-Bttr-Italic-tlf-ly1.tfm \
tex-Bttr-Italic-tlf-ly1.vf \
tex-Bttr-Italic-tlf-ot1.tfm \
tex-Bttr-Italic-tlf-t1--base.tfm \
tex-Bttr-Italic-tlf-t1.tfm \
tex-Bttr-Italic-tlf-t1.vf \
tex-Bttr-Italic-tlf-ts1--base.tfm \
tex-Bttr-Italic-tlf-ts1.tfm \
tex-Bttr-Italic-tlf-ts1.vf \
tex-Bttr-Regular-tlf-ly1--base.tfm \
tex-Bttr-Regular-tlf-ly1.tfm \
tex-Bttr-Regular-tlf-ly1.vf \
tex-Bttr-Regular-tlf-ot1.tfm \
tex-Bttr-Regular-tlf-t1--base.tfm \
tex-Bttr-Regular-tlf-t1.tfm \
tex-Bttr-Regular-tlf-t1.vf \
tex-Bttr-Regular-tlf-ts1--base.tfm \
tex-Bttr-Regular-tlf-ts1.tfm \
tex-Bttr-Regular-tlf-ts1.vf \
tex-LY1Bttr-TLF.fd \
tex-OT1Bttr-TLF.fd \
tex-T1Bttr-TLF.fd \
tex-TS1Bttr-TLF.fd \
tex-bitter.map \
tex-bitter.sty \
tex-bttr-6upxhe.enc \
tex-bttr-72jdjw.enc \
tex-bttr-azarls.enc \
tex-bttr-b5i5mx.enc \
tex-bttr-f2umud.enc \
tex-bttr-gljolu.enc \
tex-bttr-ncjtqa.enc \
tex-bttr-ssdm5h.enc \
tex-bttr-vzfpnj.enc \
tex-bttr-w3wxei.enc \
tex-bttr-x2bjkb.enc \
texlive-bitter"

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
texlive-bitter-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
