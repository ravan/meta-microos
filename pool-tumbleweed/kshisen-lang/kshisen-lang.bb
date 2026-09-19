SUMMARY = "Translations for package kshisen"
DESCRIPTION = "Provides translations for the 'kshisen' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kshisen-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "0c1f95f0f8dc5834cf2fd54fc754dfa8c199df79026c07a6d53a62f69fa74896b9f6d1e17d72ee45864b6f3b30f9c83e64a95cb43962138ae9a7cb97a3631f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kshisen-lang \
kshisen-lang-all \
locale-kshisen-af \
locale-kshisen-ar \
locale-kshisen-ast \
locale-kshisen-be \
locale-kshisen-bn \
locale-kshisen-br \
locale-kshisen-bs \
locale-kshisen-ca \
locale-kshisen-ca@valencia \
locale-kshisen-cs \
locale-kshisen-cy \
locale-kshisen-da \
locale-kshisen-de \
locale-kshisen-el \
locale-kshisen-en-GB \
locale-kshisen-eo \
locale-kshisen-es \
locale-kshisen-et \
locale-kshisen-eu \
locale-kshisen-fa \
locale-kshisen-fi \
locale-kshisen-fr \
locale-kshisen-ga \
locale-kshisen-gl \
locale-kshisen-he \
locale-kshisen-hi \
locale-kshisen-hr \
locale-kshisen-hu \
locale-kshisen-ia \
locale-kshisen-id \
locale-kshisen-is \
locale-kshisen-it \
locale-kshisen-ja \
locale-kshisen-ka \
locale-kshisen-kk \
locale-kshisen-km \
locale-kshisen-ko \
locale-kshisen-lt \
locale-kshisen-lv \
locale-kshisen-mai \
locale-kshisen-mk \
locale-kshisen-ml \
locale-kshisen-mr \
locale-kshisen-nb \
locale-kshisen-nds \
locale-kshisen-ne \
locale-kshisen-nl \
locale-kshisen-nn \
locale-kshisen-oc \
locale-kshisen-pa \
locale-kshisen-pl \
locale-kshisen-pt \
locale-kshisen-pt-BR \
locale-kshisen-ro \
locale-kshisen-ru \
locale-kshisen-sk \
locale-kshisen-sl \
locale-kshisen-sq \
locale-kshisen-sr \
locale-kshisen-sr@ijekavian \
locale-kshisen-sr@ijekavianlatin \
locale-kshisen-sr@latin \
locale-kshisen-sv \
locale-kshisen-ta \
locale-kshisen-th \
locale-kshisen-tr \
locale-kshisen-ug \
locale-kshisen-uk \
locale-kshisen-zh-CN \
locale-kshisen-zh-TW"

RDEPENDS:${PN} += "kshisen"

inherit rpm
