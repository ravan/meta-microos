SUMMARY = "Translations for package kbounce"
DESCRIPTION = "Provides translations for the 'kbounce' package."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kbounce-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "59f2ad83cd288b8aaa835baa314980dbb3140629143cb37e0f45d676b6f09364731add153272c682f5431cd03a1d8a513db7d7888ebd17c362693fc2764e1eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbounce-lang \
kbounce-lang-all \
locale-kbounce-af \
locale-kbounce-ar \
locale-kbounce-ast \
locale-kbounce-be \
locale-kbounce-bg \
locale-kbounce-bn \
locale-kbounce-br \
locale-kbounce-bs \
locale-kbounce-ca \
locale-kbounce-ca@valencia \
locale-kbounce-cs \
locale-kbounce-cy \
locale-kbounce-da \
locale-kbounce-de \
locale-kbounce-el \
locale-kbounce-en-GB \
locale-kbounce-eo \
locale-kbounce-es \
locale-kbounce-et \
locale-kbounce-eu \
locale-kbounce-fa \
locale-kbounce-fi \
locale-kbounce-fr \
locale-kbounce-ga \
locale-kbounce-gl \
locale-kbounce-he \
locale-kbounce-hi \
locale-kbounce-hr \
locale-kbounce-hu \
locale-kbounce-ia \
locale-kbounce-id \
locale-kbounce-is \
locale-kbounce-it \
locale-kbounce-ja \
locale-kbounce-ka \
locale-kbounce-kk \
locale-kbounce-km \
locale-kbounce-ko \
locale-kbounce-lt \
locale-kbounce-lv \
locale-kbounce-mai \
locale-kbounce-mk \
locale-kbounce-ml \
locale-kbounce-mr \
locale-kbounce-ms \
locale-kbounce-nb \
locale-kbounce-nds \
locale-kbounce-ne \
locale-kbounce-nl \
locale-kbounce-nn \
locale-kbounce-oc \
locale-kbounce-pa \
locale-kbounce-pl \
locale-kbounce-pt \
locale-kbounce-pt-BR \
locale-kbounce-ro \
locale-kbounce-ru \
locale-kbounce-sk \
locale-kbounce-sl \
locale-kbounce-sq \
locale-kbounce-sr \
locale-kbounce-sr@ijekavian \
locale-kbounce-sr@ijekavianlatin \
locale-kbounce-sr@latin \
locale-kbounce-sv \
locale-kbounce-ta \
locale-kbounce-te \
locale-kbounce-th \
locale-kbounce-tr \
locale-kbounce-ug \
locale-kbounce-uk \
locale-kbounce-vi \
locale-kbounce-zh-CN \
locale-kbounce-zh-TW"

RDEPENDS:${PN} += "kbounce"

inherit rpm
