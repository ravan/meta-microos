SUMMARY = "Translations for package kcalc"
DESCRIPTION = "Provides translations for the 'kcalc' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kcalc-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "b23a5aaebd443f586695304e85ce63d35d12a3614e54cf4b10de60a0f4776283e8fb49bf51c4bef3b1905aff4d73d467149ca6521057bc1ab054c060bfe73ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcalc-lang \
kcalc-lang-all \
locale-kcalc-af \
locale-kcalc-ar \
locale-kcalc-ast \
locale-kcalc-az \
locale-kcalc-be \
locale-kcalc-bg \
locale-kcalc-br \
locale-kcalc-bs \
locale-kcalc-ca \
locale-kcalc-ca@valencia \
locale-kcalc-cs \
locale-kcalc-cy \
locale-kcalc-da \
locale-kcalc-de \
locale-kcalc-el \
locale-kcalc-en-GB \
locale-kcalc-eo \
locale-kcalc-es \
locale-kcalc-et \
locale-kcalc-eu \
locale-kcalc-fa \
locale-kcalc-fi \
locale-kcalc-fr \
locale-kcalc-ga \
locale-kcalc-gl \
locale-kcalc-he \
locale-kcalc-hi \
locale-kcalc-hr \
locale-kcalc-hu \
locale-kcalc-ia \
locale-kcalc-id \
locale-kcalc-is \
locale-kcalc-it \
locale-kcalc-ja \
locale-kcalc-ka \
locale-kcalc-kk \
locale-kcalc-km \
locale-kcalc-ko \
locale-kcalc-lt \
locale-kcalc-lv \
locale-kcalc-mk \
locale-kcalc-mr \
locale-kcalc-ms \
locale-kcalc-nb \
locale-kcalc-nds \
locale-kcalc-ne \
locale-kcalc-nl \
locale-kcalc-nn \
locale-kcalc-oc \
locale-kcalc-pa \
locale-kcalc-pl \
locale-kcalc-pt \
locale-kcalc-pt-BR \
locale-kcalc-ro \
locale-kcalc-ru \
locale-kcalc-sk \
locale-kcalc-sl \
locale-kcalc-sq \
locale-kcalc-sr \
locale-kcalc-sr@ijekavian \
locale-kcalc-sr@ijekavianlatin \
locale-kcalc-sr@latin \
locale-kcalc-sv \
locale-kcalc-ta \
locale-kcalc-th \
locale-kcalc-tr \
locale-kcalc-ug \
locale-kcalc-uk \
locale-kcalc-wa \
locale-kcalc-zh-CN \
locale-kcalc-zh-TW"

RDEPENDS:${PN} += "kcalc"

inherit rpm
