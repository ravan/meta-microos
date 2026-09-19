SUMMARY = "Translations for package ristretto"
DESCRIPTION = "Provides translations for the 'ristretto' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.0"

RPM_NAME = "ristretto-lang-0.14.0-1.3.noarch.rpm"
RPM_HASH = "39e2592948b3c9f84849486ff90e5f19337cc2b3c9d3ddb3d3275dd7c67d7413bc70ef61c29add00fa4721277e8149aa948607ec0f66eb85a7bd8970d4f10e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ristretto-ar \
locale-ristretto-ast \
locale-ristretto-be \
locale-ristretto-bg \
locale-ristretto-ca \
locale-ristretto-cs \
locale-ristretto-da \
locale-ristretto-de \
locale-ristretto-el \
locale-ristretto-en-AU \
locale-ristretto-en-GB \
locale-ristretto-es \
locale-ristretto-et \
locale-ristretto-eu \
locale-ristretto-fi \
locale-ristretto-fr \
locale-ristretto-gl \
locale-ristretto-he \
locale-ristretto-hr \
locale-ristretto-hu \
locale-ristretto-id \
locale-ristretto-is \
locale-ristretto-it \
locale-ristretto-ja \
locale-ristretto-kk \
locale-ristretto-ko \
locale-ristretto-lt \
locale-ristretto-lv \
locale-ristretto-ms \
locale-ristretto-nb \
locale-ristretto-nl \
locale-ristretto-oc \
locale-ristretto-pl \
locale-ristretto-pt \
locale-ristretto-pt-BR \
locale-ristretto-ro \
locale-ristretto-ru \
locale-ristretto-sk \
locale-ristretto-sl \
locale-ristretto-sq \
locale-ristretto-sr \
locale-ristretto-sv \
locale-ristretto-te \
locale-ristretto-th \
locale-ristretto-tr \
locale-ristretto-ug \
locale-ristretto-uk \
locale-ristretto-vi \
locale-ristretto-zh-CN \
locale-ristretto-zh-TW \
ristretto-lang \
ristretto-lang-all"

RDEPENDS:${PN} += "ristretto"

inherit rpm
