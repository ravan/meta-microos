SUMMARY = "Translations for package step"
DESCRIPTION = "Provides translations for the 'step' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "step-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "0789c933775b0a4ef82ef6e4e7d6f21b6ac39773b2129e7f83a0b17a8c84a7dd8f3947ae892b3e75aff32f4fa9101d39675edc0ebd8afa326ecfceba2c3ff65a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-step-ar \
locale-step-be \
locale-step-bs \
locale-step-ca \
locale-step-ca@valencia \
locale-step-cs \
locale-step-da \
locale-step-de \
locale-step-el \
locale-step-en-GB \
locale-step-eo \
locale-step-es \
locale-step-et \
locale-step-eu \
locale-step-fi \
locale-step-fr \
locale-step-ga \
locale-step-gl \
locale-step-gu \
locale-step-hr \
locale-step-hu \
locale-step-ia \
locale-step-it \
locale-step-ja \
locale-step-ka \
locale-step-kk \
locale-step-km \
locale-step-ko \
locale-step-lt \
locale-step-lv \
locale-step-mai \
locale-step-ml \
locale-step-mr \
locale-step-nb \
locale-step-nds \
locale-step-nl \
locale-step-nn \
locale-step-oc \
locale-step-pa \
locale-step-pl \
locale-step-pt \
locale-step-pt-BR \
locale-step-ro \
locale-step-ru \
locale-step-si \
locale-step-sk \
locale-step-sl \
locale-step-sq \
locale-step-sv \
locale-step-th \
locale-step-tr \
locale-step-ug \
locale-step-uk \
locale-step-zh-CN \
locale-step-zh-TW \
step-lang \
step-lang-all"

RDEPENDS:${PN} += "step"

inherit rpm
