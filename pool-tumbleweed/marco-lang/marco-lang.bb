SUMMARY = "Translations for package marco"
DESCRIPTION = "Provides translations for the 'marco' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "marco-lang-1.28.1-2.5.noarch.rpm"
RPM_HASH = "bb0063c6141ac81c30f82a5afa8a8df99067c850b66ee740f815b41916e52c0a7e73028830732bb310bfc831ea3b5e4d7f5dcb74e08db70ead1f8e8ecca210b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-marco-af \
locale-marco-ar \
locale-marco-as \
locale-marco-ast \
locale-marco-az \
locale-marco-be \
locale-marco-bg \
locale-marco-bn \
locale-marco-bn-IN \
locale-marco-br \
locale-marco-bs \
locale-marco-ca \
locale-marco-ca@valencia \
locale-marco-cs \
locale-marco-cy \
locale-marco-da \
locale-marco-de \
locale-marco-dz \
locale-marco-el \
locale-marco-en-AU \
locale-marco-en-CA \
locale-marco-en-GB \
locale-marco-eo \
locale-marco-es \
locale-marco-es-AR \
locale-marco-es-CO \
locale-marco-es-MX \
locale-marco-es-PR \
locale-marco-et \
locale-marco-eu \
locale-marco-fa \
locale-marco-fi \
locale-marco-fr \
locale-marco-fur \
locale-marco-ga \
locale-marco-gl \
locale-marco-gu \
locale-marco-he \
locale-marco-hi \
locale-marco-hr \
locale-marco-hu \
locale-marco-id \
locale-marco-is \
locale-marco-it \
locale-marco-ja \
locale-marco-ka \
locale-marco-kk \
locale-marco-kn \
locale-marco-ko \
locale-marco-lt \
locale-marco-lv \
locale-marco-mai \
locale-marco-mk \
locale-marco-ml \
locale-marco-mr \
locale-marco-ms \
locale-marco-nb \
locale-marco-nds \
locale-marco-ne \
locale-marco-nl \
locale-marco-nn \
locale-marco-oc \
locale-marco-or \
locale-marco-pa \
locale-marco-pl \
locale-marco-pt \
locale-marco-pt-BR \
locale-marco-ro \
locale-marco-ru \
locale-marco-si \
locale-marco-sk \
locale-marco-sl \
locale-marco-sq \
locale-marco-sr \
locale-marco-sr@latin \
locale-marco-sv \
locale-marco-ta \
locale-marco-te \
locale-marco-th \
locale-marco-tr \
locale-marco-ug \
locale-marco-uk \
locale-marco-vi \
locale-marco-wa \
locale-marco-zh-CN \
locale-marco-zh-HK \
locale-marco-zh-TW \
marco-lang \
marco-lang-all"

RDEPENDS:${PN} += "marco"

inherit rpm
