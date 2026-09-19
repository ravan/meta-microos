SUMMARY = "Translations for package akonadi-import-wizard"
DESCRIPTION = "Provides translations for the 'akonadi-import-wizard' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-import-wizard-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "c0b5e6ae62fb5d5271fa3e521b83be4a9f7cb02dfb1d616171b45a5311d0e9b54da00088321d0395a54c4d74b215c1d526af09fe0f81881b2c3290ed74a818da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-import-wizard-lang \
akonadi-import-wizard-lang-all \
locale-akonadi-import-wizard-ar \
locale-akonadi-import-wizard-ast \
locale-akonadi-import-wizard-az \
locale-akonadi-import-wizard-bg \
locale-akonadi-import-wizard-bs \
locale-akonadi-import-wizard-ca \
locale-akonadi-import-wizard-ca@valencia \
locale-akonadi-import-wizard-cs \
locale-akonadi-import-wizard-da \
locale-akonadi-import-wizard-de \
locale-akonadi-import-wizard-el \
locale-akonadi-import-wizard-en-GB \
locale-akonadi-import-wizard-eo \
locale-akonadi-import-wizard-es \
locale-akonadi-import-wizard-et \
locale-akonadi-import-wizard-eu \
locale-akonadi-import-wizard-fi \
locale-akonadi-import-wizard-fr \
locale-akonadi-import-wizard-ga \
locale-akonadi-import-wizard-gl \
locale-akonadi-import-wizard-he \
locale-akonadi-import-wizard-hi \
locale-akonadi-import-wizard-hu \
locale-akonadi-import-wizard-ia \
locale-akonadi-import-wizard-id \
locale-akonadi-import-wizard-it \
locale-akonadi-import-wizard-ja \
locale-akonadi-import-wizard-ka \
locale-akonadi-import-wizard-kk \
locale-akonadi-import-wizard-km \
locale-akonadi-import-wizard-ko \
locale-akonadi-import-wizard-lt \
locale-akonadi-import-wizard-lv \
locale-akonadi-import-wizard-mr \
locale-akonadi-import-wizard-nb \
locale-akonadi-import-wizard-nds \
locale-akonadi-import-wizard-nl \
locale-akonadi-import-wizard-nn \
locale-akonadi-import-wizard-pl \
locale-akonadi-import-wizard-pt \
locale-akonadi-import-wizard-pt-BR \
locale-akonadi-import-wizard-ro \
locale-akonadi-import-wizard-ru \
locale-akonadi-import-wizard-sk \
locale-akonadi-import-wizard-sl \
locale-akonadi-import-wizard-sv \
locale-akonadi-import-wizard-ta \
locale-akonadi-import-wizard-tr \
locale-akonadi-import-wizard-ug \
locale-akonadi-import-wizard-uk \
locale-akonadi-import-wizard-zh-CN \
locale-akonadi-import-wizard-zh-TW"

RDEPENDS:${PN} += "akonadi-import-wizard"

inherit rpm
