SUMMARY = "Translations for package akonadi-contacts"
DESCRIPTION = "Provides translations for the 'akonadi-contacts' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-contacts-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "e996d4e6a8c1a39b0dd78bf2048232565140b8857ef1501c251f826f369771c9e6c8450ccc1f615ece1249af13974028f48d5c830c155c9f5dc57ba318fe68fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-contacts-lang \
akonadi-contacts-lang-all \
locale-akonadi-contacts-ar \
locale-akonadi-contacts-ast \
locale-akonadi-contacts-az \
locale-akonadi-contacts-bg \
locale-akonadi-contacts-bs \
locale-akonadi-contacts-ca \
locale-akonadi-contacts-ca@valencia \
locale-akonadi-contacts-cs \
locale-akonadi-contacts-da \
locale-akonadi-contacts-de \
locale-akonadi-contacts-el \
locale-akonadi-contacts-en-GB \
locale-akonadi-contacts-eo \
locale-akonadi-contacts-es \
locale-akonadi-contacts-et \
locale-akonadi-contacts-eu \
locale-akonadi-contacts-fi \
locale-akonadi-contacts-fr \
locale-akonadi-contacts-ga \
locale-akonadi-contacts-gl \
locale-akonadi-contacts-he \
locale-akonadi-contacts-hi \
locale-akonadi-contacts-hr \
locale-akonadi-contacts-hu \
locale-akonadi-contacts-ia \
locale-akonadi-contacts-id \
locale-akonadi-contacts-is \
locale-akonadi-contacts-it \
locale-akonadi-contacts-ja \
locale-akonadi-contacts-ka \
locale-akonadi-contacts-kk \
locale-akonadi-contacts-km \
locale-akonadi-contacts-ko \
locale-akonadi-contacts-lt \
locale-akonadi-contacts-lv \
locale-akonadi-contacts-mai \
locale-akonadi-contacts-mr \
locale-akonadi-contacts-nb \
locale-akonadi-contacts-nds \
locale-akonadi-contacts-nl \
locale-akonadi-contacts-nn \
locale-akonadi-contacts-pa \
locale-akonadi-contacts-pl \
locale-akonadi-contacts-pt \
locale-akonadi-contacts-pt-BR \
locale-akonadi-contacts-ro \
locale-akonadi-contacts-ru \
locale-akonadi-contacts-sk \
locale-akonadi-contacts-sl \
locale-akonadi-contacts-sr \
locale-akonadi-contacts-sr@ijekavian \
locale-akonadi-contacts-sr@ijekavianlatin \
locale-akonadi-contacts-sr@latin \
locale-akonadi-contacts-sv \
locale-akonadi-contacts-ta \
locale-akonadi-contacts-tr \
locale-akonadi-contacts-ug \
locale-akonadi-contacts-uk \
locale-akonadi-contacts-zh-CN \
locale-akonadi-contacts-zh-TW"

RDEPENDS:${PN} += "akonadi-contacts"

inherit rpm
