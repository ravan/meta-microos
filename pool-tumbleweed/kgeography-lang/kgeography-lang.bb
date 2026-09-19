SUMMARY = "Translations for package kgeography"
DESCRIPTION = "Provides translations for the 'kgeography' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kgeography-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "04ec208b63425f55098456801f52ed63fbb1253ce583ff843444cb90657b481b1827c605823439b1c6ccb55453b132da9d87d69c51877fdf9f5857a624b512b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgeography-lang \
kgeography-lang-all \
locale-kgeography-ar \
locale-kgeography-ast \
locale-kgeography-az \
locale-kgeography-be \
locale-kgeography-bg \
locale-kgeography-br \
locale-kgeography-bs \
locale-kgeography-ca \
locale-kgeography-ca@valencia \
locale-kgeography-cs \
locale-kgeography-cy \
locale-kgeography-da \
locale-kgeography-de \
locale-kgeography-el \
locale-kgeography-en-GB \
locale-kgeography-eo \
locale-kgeography-es \
locale-kgeography-et \
locale-kgeography-eu \
locale-kgeography-fa \
locale-kgeography-fi \
locale-kgeography-fr \
locale-kgeography-ga \
locale-kgeography-gl \
locale-kgeography-gu \
locale-kgeography-he \
locale-kgeography-hi \
locale-kgeography-hr \
locale-kgeography-hu \
locale-kgeography-ia \
locale-kgeography-is \
locale-kgeography-it \
locale-kgeography-ja \
locale-kgeography-ka \
locale-kgeography-kk \
locale-kgeography-km \
locale-kgeography-ko \
locale-kgeography-lt \
locale-kgeography-lv \
locale-kgeography-mai \
locale-kgeography-mk \
locale-kgeography-ml \
locale-kgeography-mr \
locale-kgeography-ms \
locale-kgeography-nb \
locale-kgeography-nds \
locale-kgeography-ne \
locale-kgeography-nl \
locale-kgeography-nn \
locale-kgeography-oc \
locale-kgeography-pa \
locale-kgeography-pl \
locale-kgeography-pt \
locale-kgeography-pt-BR \
locale-kgeography-ro \
locale-kgeography-ru \
locale-kgeography-si \
locale-kgeography-sk \
locale-kgeography-sl \
locale-kgeography-sq \
locale-kgeography-sv \
locale-kgeography-ta \
locale-kgeography-th \
locale-kgeography-tr \
locale-kgeography-ug \
locale-kgeography-uk \
locale-kgeography-zh-CN \
locale-kgeography-zh-TW"

RDEPENDS:${PN} += "kgeography"

inherit rpm
