SUMMARY = "Translations for package libpeas2"
DESCRIPTION = "Provides translations for the 'libpeas2' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.1"

RPM_NAME = "libpeas2-lang-2.2.1-2.4.noarch.rpm"
RPM_HASH = "d2ce87ab63aa80e704937e78b533ff6b1b1ad9fb46d5037ae2a08da1281f6393de525418cda6ade6dd97ec12d26f6afd07363c0f6be80eacf0ae5aaf68935e50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpeas2-lang \
libpeas2-lang-all \
locale-libpeas2-ar \
locale-libpeas2-as \
locale-libpeas2-ast \
locale-libpeas2-be \
locale-libpeas2-bg \
locale-libpeas2-bn \
locale-libpeas2-bn-IN \
locale-libpeas2-bs \
locale-libpeas2-ca \
locale-libpeas2-ca@valencia \
locale-libpeas2-cs \
locale-libpeas2-da \
locale-libpeas2-de \
locale-libpeas2-el \
locale-libpeas2-en-GB \
locale-libpeas2-eo \
locale-libpeas2-es \
locale-libpeas2-et \
locale-libpeas2-eu \
locale-libpeas2-fa \
locale-libpeas2-fi \
locale-libpeas2-fr \
locale-libpeas2-fur \
locale-libpeas2-gl \
locale-libpeas2-gu \
locale-libpeas2-he \
locale-libpeas2-hi \
locale-libpeas2-hr \
locale-libpeas2-hu \
locale-libpeas2-ia \
locale-libpeas2-id \
locale-libpeas2-is \
locale-libpeas2-it \
locale-libpeas2-ja \
locale-libpeas2-ka \
locale-libpeas2-kk \
locale-libpeas2-kn \
locale-libpeas2-ko \
locale-libpeas2-lt \
locale-libpeas2-lv \
locale-libpeas2-ml \
locale-libpeas2-mr \
locale-libpeas2-ms \
locale-libpeas2-nb \
locale-libpeas2-nds \
locale-libpeas2-ne \
locale-libpeas2-nl \
locale-libpeas2-nn \
locale-libpeas2-oc \
locale-libpeas2-or \
locale-libpeas2-pa \
locale-libpeas2-pl \
locale-libpeas2-pt \
locale-libpeas2-pt-BR \
locale-libpeas2-ro \
locale-libpeas2-ru \
locale-libpeas2-sk \
locale-libpeas2-sl \
locale-libpeas2-sr \
locale-libpeas2-sr@latin \
locale-libpeas2-sv \
locale-libpeas2-ta \
locale-libpeas2-te \
locale-libpeas2-th \
locale-libpeas2-tr \
locale-libpeas2-ug \
locale-libpeas2-uk \
locale-libpeas2-vi \
locale-libpeas2-zh-CN \
locale-libpeas2-zh-HK \
locale-libpeas2-zh-TW"

RDEPENDS:${PN} += "libpeas2"

inherit rpm
