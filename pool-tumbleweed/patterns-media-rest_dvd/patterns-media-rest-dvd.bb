SUMMARY = "Remaining Software"
DESCRIPTION = "Packages that are on CD but not in other patterns."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-media-rest_dvd-20170319-62.1.aarch64.rpm"
RPM_HASH = "8b99561e913782cb2d1ba741b38a0d52d1b251a70045ccf99ac4578ef7a92dde1c0cc1b4d78674cccb4a05a825b9ec41a541e84df828fbfc74a3e11dda51c278"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-media-rest-dvd \
patterns-openSUSE-rest-dvd"

RDEPENDS:${PN} += "cracklib-dict-full \
indic-fonts \
ipa-gothic-fonts \
khmeros-fonts \
lklug-fonts \
pattern- \
thai-fonts \
udftools \
un-fonts \
yast2-trans-af \
yast2-trans-ar \
yast2-trans-bg \
yast2-trans-bn \
yast2-trans-bs \
yast2-trans-ca \
yast2-trans-cs \
yast2-trans-cy \
yast2-trans-da \
yast2-trans-de \
yast2-trans-el \
yast2-trans-en-GB \
yast2-trans-es \
yast2-trans-et \
yast2-trans-fa \
yast2-trans-fi \
yast2-trans-fr \
yast2-trans-gl \
yast2-trans-gu \
yast2-trans-hi \
yast2-trans-hr \
yast2-trans-hu \
yast2-trans-id \
yast2-trans-it \
yast2-trans-ja \
yast2-trans-jv \
yast2-trans-ka \
yast2-trans-km \
yast2-trans-ko \
yast2-trans-lo \
yast2-trans-lt \
yast2-trans-mk \
yast2-trans-mr \
yast2-trans-nb \
yast2-trans-nl \
yast2-trans-pa \
yast2-trans-pl \
yast2-trans-pt \
yast2-trans-pt-BR \
yast2-trans-ro \
yast2-trans-ru \
yast2-trans-si \
yast2-trans-sk \
yast2-trans-sl \
yast2-trans-sr \
yast2-trans-sv \
yast2-trans-ta \
yast2-trans-th \
yast2-trans-tr \
yast2-trans-uk \
yast2-trans-vi \
yast2-trans-wa \
yast2-trans-xh \
yast2-trans-zh-CN \
yast2-trans-zh-TW \
yast2-trans-zu"

inherit rpm
