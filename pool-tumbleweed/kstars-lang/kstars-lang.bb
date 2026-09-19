SUMMARY = "Translations for package kstars"
DESCRIPTION = "Provides translations for the 'kstars' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "3.8.4.1"

RPM_NAME = "kstars-lang-3.8.4.1-1.1.noarch.rpm"
RPM_HASH = "988ae3374dcef0f76c788b8bbf189f81fecbca131312614055b85c7e71024c72a71e32527af99a687798e272b54765284db73c320d1d630b8cadff870b0cac7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kstars-lang \
kstars-lang-all \
locale-kstars-af \
locale-kstars-ar \
locale-kstars-az \
locale-kstars-be \
locale-kstars-bg \
locale-kstars-bn \
locale-kstars-br \
locale-kstars-bs \
locale-kstars-ca \
locale-kstars-ca@valencia \
locale-kstars-cs \
locale-kstars-cy \
locale-kstars-da \
locale-kstars-de \
locale-kstars-el \
locale-kstars-en-GB \
locale-kstars-eo \
locale-kstars-es \
locale-kstars-et \
locale-kstars-eu \
locale-kstars-fa \
locale-kstars-fi \
locale-kstars-fr \
locale-kstars-ga \
locale-kstars-gl \
locale-kstars-gu \
locale-kstars-hi \
locale-kstars-hr \
locale-kstars-hu \
locale-kstars-is \
locale-kstars-it \
locale-kstars-ja \
locale-kstars-ka \
locale-kstars-kk \
locale-kstars-km \
locale-kstars-ko \
locale-kstars-lt \
locale-kstars-lv \
locale-kstars-mai \
locale-kstars-mk \
locale-kstars-ml \
locale-kstars-mr \
locale-kstars-ms \
locale-kstars-nb \
locale-kstars-nds \
locale-kstars-ne \
locale-kstars-nl \
locale-kstars-nn \
locale-kstars-oc \
locale-kstars-pa \
locale-kstars-pl \
locale-kstars-pt \
locale-kstars-pt-BR \
locale-kstars-ro \
locale-kstars-ru \
locale-kstars-si \
locale-kstars-sk \
locale-kstars-sl \
locale-kstars-sq \
locale-kstars-sv \
locale-kstars-ta \
locale-kstars-th \
locale-kstars-tr \
locale-kstars-ug \
locale-kstars-uk \
locale-kstars-zh-CN \
locale-kstars-zh-TW"

RDEPENDS:${PN} += "kstars"

inherit rpm
