SUMMARY = "Help change metrics of fonts from japanese-otf"
DESCRIPTION = "This package changes the setup of the japanese-otf package so \
that the TFMs for direct input are all replaced by new ones \
with prefixed names; for example, nmlminr-h will be replaced by \
foo--nmlminr-h, where foo is a prefix specified by the user. \
This function will assist users who want to use the \
japanese-otf package together with tailored TFMs of Japanese \
fonts. The 'jodel' part of the package name stands for \
'japanese-otf deluxe'. Here 'deluxe' is the name of \
japanese-otf's option for employing multi-weight Japanese font \
families. This option is probably the most likely reason for \
using japanese-otf. So pxjodel is really about japanese-otf's \
'deluxe' option, hence the name. It is not related to yodel \
singing, although some sense of word-play is intended."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn77682"

RPM_NAME = "texlive-pxjodel-2026.226.0.0.3asvn77682-60.4.noarch.rpm"
RPM_HASH = "2fe41ccf1ea08fef4475782f9f3da9cc1a6001a0a1dc8a29633b5c0b29c5d3c1a4416d3a2e9340dd45bbf1178174029487f23cafc9b9b3a5c1960f64a240c32d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jodhgothb-hq.tfm \
tex-jodhgothb-hq.vf \
tex-jodhgothbn-h.tfm \
tex-jodhgothbn-h.vf \
tex-jodhgothbn-v.tfm \
tex-jodhgothbn-v.vf \
tex-jodhgotheb-hq.tfm \
tex-jodhgotheb-hq.vf \
tex-jodhgothebn-h.tfm \
tex-jodhgothebn-h.vf \
tex-jodhgothebn-v.tfm \
tex-jodhgothebn-v.vf \
tex-jodhgothr-hq.tfm \
tex-jodhgothr-hq.vf \
tex-jodhgothrn-h.tfm \
tex-jodhgothrn-h.vf \
tex-jodhgothrn-v.tfm \
tex-jodhgothrn-v.vf \
tex-jodhmgothr-hq.tfm \
tex-jodhmgothr-hq.vf \
tex-jodhmgothrn-h.tfm \
tex-jodhmgothrn-h.vf \
tex-jodhmgothrn-v.tfm \
tex-jodhmgothrn-v.vf \
tex-jodhminb-hq.tfm \
tex-jodhminb-hq.vf \
tex-jodhminbn-h.tfm \
tex-jodhminbn-h.vf \
tex-jodhminbn-v.tfm \
tex-jodhminbn-v.vf \
tex-jodhminl-hq.tfm \
tex-jodhminl-hq.vf \
tex-jodhminln-h.tfm \
tex-jodhminln-h.vf \
tex-jodhminln-v.tfm \
tex-jodhminln-v.vf \
tex-jodhminr-hq.tfm \
tex-jodhminr-hq.vf \
tex-jodhminrn-h.tfm \
tex-jodhminrn-h.vf \
tex-jodhminrn-v.tfm \
tex-jodhminrn-v.vf \
tex-pxjodel.sty \
tex-zu-jodhgothb-hq.tfm \
tex-zu-jodhgothb-hq.vf \
tex-zu-jodhgotheb-hq.tfm \
tex-zu-jodhgotheb-hq.vf \
tex-zu-jodhgothr-hq.tfm \
tex-zu-jodhgothr-hq.vf \
tex-zu-jodhmgothr-hq.tfm \
tex-zu-jodhmgothr-hq.vf \
tex-zu-jodhminb-hq.tfm \
tex-zu-jodhminb-hq.vf \
tex-zu-jodhminl-hq.tfm \
tex-zu-jodhminl-hq.vf \
tex-zu-jodhminr-hq.tfm \
tex-zu-jodhminr-hq.vf \
texlive-pxjodel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hgothbn-h.tfm \
tex-hgothbn-v.tfm \
tex-hgothebn-h.tfm \
tex-hgothebn-v.tfm \
tex-hgothrn-h.tfm \
tex-hgothrn-v.tfm \
tex-hmgothrn-h.tfm \
tex-hmgothrn-v.tfm \
tex-hminbn-h.tfm \
tex-hminbn-v.tfm \
tex-hminln-h.tfm \
tex-hminrn-h.tfm \
tex-hminrn-v.tfm \
tex-ifuptex.sty \
tex-otf-cjgb-h.tfm \
tex-otf-cjgb-v.tfm \
tex-otf-cjge-h.tfm \
tex-otf-cjge-v.tfm \
tex-otf-cjgr-h.tfm \
tex-otf-cjgr-v.tfm \
tex-otf-cjmb-h.tfm \
tex-otf-cjmb-v.tfm \
tex-otf-cjmgr-h.tfm \
tex-otf-cjmgr-v.tfm \
tex-otf-cjml-h.tfm \
tex-otf-cjmr-h.tfm \
tex-otf-cjmr-v.tfm \
tex-otf-ujgb-h.tfm \
tex-otf-ujge-h.tfm \
tex-otf-ujgr-h.tfm \
tex-otf-ujmb-h.tfm \
tex-otf-ujmgr-h.tfm \
tex-otf-ujml-h.tfm \
tex-otf-ujmr-h.tfm \
tex-otf.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
