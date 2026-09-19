SUMMARY = "Translations for package vinagre"
DESCRIPTION = "Provides translations for the 'vinagre' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.0"

RPM_NAME = "vinagre-lang-3.22.0-21.1.noarch.rpm"
RPM_HASH = "587efd9e650c3b3f311c0f0ae25e7090affb0cc53882f920106f17357bd45ea9ebf1986634a8564606a07f4503199e7dfeb346644b9543681c1183d5013985ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-vinagre-ar \
locale-vinagre-as \
locale-vinagre-ast \
locale-vinagre-be \
locale-vinagre-be@latin \
locale-vinagre-bg \
locale-vinagre-bn \
locale-vinagre-bn-IN \
locale-vinagre-bs \
locale-vinagre-ca \
locale-vinagre-ca@valencia \
locale-vinagre-cs \
locale-vinagre-da \
locale-vinagre-de \
locale-vinagre-el \
locale-vinagre-en-GB \
locale-vinagre-en@shaw \
locale-vinagre-eo \
locale-vinagre-es \
locale-vinagre-et \
locale-vinagre-eu \
locale-vinagre-fa \
locale-vinagre-fi \
locale-vinagre-fr \
locale-vinagre-fur \
locale-vinagre-ga \
locale-vinagre-gl \
locale-vinagre-gu \
locale-vinagre-he \
locale-vinagre-hi \
locale-vinagre-hu \
locale-vinagre-id \
locale-vinagre-is \
locale-vinagre-it \
locale-vinagre-ja \
locale-vinagre-kk \
locale-vinagre-kn \
locale-vinagre-ko \
locale-vinagre-lt \
locale-vinagre-lv \
locale-vinagre-mai \
locale-vinagre-mk \
locale-vinagre-ml \
locale-vinagre-mr \
locale-vinagre-ms \
locale-vinagre-nb \
locale-vinagre-ne \
locale-vinagre-nl \
locale-vinagre-nn \
locale-vinagre-oc \
locale-vinagre-or \
locale-vinagre-pa \
locale-vinagre-pl \
locale-vinagre-pt \
locale-vinagre-pt-BR \
locale-vinagre-ro \
locale-vinagre-ru \
locale-vinagre-si \
locale-vinagre-sk \
locale-vinagre-sl \
locale-vinagre-sq \
locale-vinagre-sr \
locale-vinagre-sr@latin \
locale-vinagre-sv \
locale-vinagre-ta \
locale-vinagre-te \
locale-vinagre-th \
locale-vinagre-tr \
locale-vinagre-ug \
locale-vinagre-uk \
locale-vinagre-vi \
locale-vinagre-zh-CN \
locale-vinagre-zh-HK \
locale-vinagre-zh-TW \
vinagre-lang \
vinagre-lang-all"

RDEPENDS:${PN} += "vinagre"

inherit rpm
