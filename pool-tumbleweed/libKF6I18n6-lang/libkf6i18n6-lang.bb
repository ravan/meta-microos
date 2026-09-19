SUMMARY = "Translations for package libKF6I18n6"
DESCRIPTION = "Provides translations for the 'libKF6I18n6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6I18n6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "959a71b0505339ef8615463972b449f995dcc618ef5690b4f5d6e192eb028d1f1eb190a5bb47d2ec21f3cc5dfba5aa7cd729387a6c310cd00c492a07ceeed32d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6I18n6-lang \
libKF6I18n6-lang-all \
locale-libKF6I18n6-af \
locale-libKF6I18n6-ar \
locale-libKF6I18n6-as \
locale-libKF6I18n6-ast \
locale-libKF6I18n6-az \
locale-libKF6I18n6-be \
locale-libKF6I18n6-be@latin \
locale-libKF6I18n6-bg \
locale-libKF6I18n6-bn \
locale-libKF6I18n6-bn-IN \
locale-libKF6I18n6-br \
locale-libKF6I18n6-bs \
locale-libKF6I18n6-ca \
locale-libKF6I18n6-ca@valencia \
locale-libKF6I18n6-cs \
locale-libKF6I18n6-cy \
locale-libKF6I18n6-da \
locale-libKF6I18n6-de \
locale-libKF6I18n6-el \
locale-libKF6I18n6-en-GB \
locale-libKF6I18n6-eo \
locale-libKF6I18n6-es \
locale-libKF6I18n6-et \
locale-libKF6I18n6-eu \
locale-libKF6I18n6-fa \
locale-libKF6I18n6-fi \
locale-libKF6I18n6-fr \
locale-libKF6I18n6-ga \
locale-libKF6I18n6-gd \
locale-libKF6I18n6-gl \
locale-libKF6I18n6-gu \
locale-libKF6I18n6-he \
locale-libKF6I18n6-hi \
locale-libKF6I18n6-hr \
locale-libKF6I18n6-hu \
locale-libKF6I18n6-ia \
locale-libKF6I18n6-id \
locale-libKF6I18n6-is \
locale-libKF6I18n6-it \
locale-libKF6I18n6-ja \
locale-libKF6I18n6-ka \
locale-libKF6I18n6-kk \
locale-libKF6I18n6-km \
locale-libKF6I18n6-kn \
locale-libKF6I18n6-ko \
locale-libKF6I18n6-lt \
locale-libKF6I18n6-lv \
locale-libKF6I18n6-mai \
locale-libKF6I18n6-mk \
locale-libKF6I18n6-ml \
locale-libKF6I18n6-mr \
locale-libKF6I18n6-ms \
locale-libKF6I18n6-nb \
locale-libKF6I18n6-nds \
locale-libKF6I18n6-ne \
locale-libKF6I18n6-nl \
locale-libKF6I18n6-nn \
locale-libKF6I18n6-oc \
locale-libKF6I18n6-or \
locale-libKF6I18n6-pa \
locale-libKF6I18n6-pl \
locale-libKF6I18n6-pt \
locale-libKF6I18n6-pt-BR \
locale-libKF6I18n6-ro \
locale-libKF6I18n6-ru \
locale-libKF6I18n6-si \
locale-libKF6I18n6-sk \
locale-libKF6I18n6-sl \
locale-libKF6I18n6-sq \
locale-libKF6I18n6-sr \
locale-libKF6I18n6-sr@ijekavian \
locale-libKF6I18n6-sr@ijekavianlatin \
locale-libKF6I18n6-sr@latin \
locale-libKF6I18n6-sv \
locale-libKF6I18n6-ta \
locale-libKF6I18n6-te \
locale-libKF6I18n6-th \
locale-libKF6I18n6-tr \
locale-libKF6I18n6-ug \
locale-libKF6I18n6-uk \
locale-libKF6I18n6-vi \
locale-libKF6I18n6-wa \
locale-libKF6I18n6-zh-CN \
locale-libKF6I18n6-zh-HK \
locale-libKF6I18n6-zh-TW"

RDEPENDS:${PN} += "libKF6I18n6"

inherit rpm
