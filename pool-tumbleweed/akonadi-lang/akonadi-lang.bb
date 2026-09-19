SUMMARY = "Translations for package akonadi"
DESCRIPTION = "Provides translations for the 'akonadi' package."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "7dc5c3f11c817933fa803989050b3ed4900fd548c5a6a6f37c6a8ff4a1f88254a1c9c2ff3fcf28acfb449c3bd055557a746112bbebdcc4f0ffcd27a468c08013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-lang \
akonadi-lang-all \
locale-akonadi-ar \
locale-akonadi-ast \
locale-akonadi-az \
locale-akonadi-be \
locale-akonadi-bg \
locale-akonadi-bs \
locale-akonadi-ca \
locale-akonadi-ca@valencia \
locale-akonadi-cs \
locale-akonadi-da \
locale-akonadi-de \
locale-akonadi-el \
locale-akonadi-en-GB \
locale-akonadi-eo \
locale-akonadi-es \
locale-akonadi-et \
locale-akonadi-eu \
locale-akonadi-fi \
locale-akonadi-fr \
locale-akonadi-ga \
locale-akonadi-gl \
locale-akonadi-he \
locale-akonadi-hi \
locale-akonadi-hu \
locale-akonadi-ia \
locale-akonadi-id \
locale-akonadi-is \
locale-akonadi-it \
locale-akonadi-ja \
locale-akonadi-ka \
locale-akonadi-kk \
locale-akonadi-km \
locale-akonadi-ko \
locale-akonadi-lt \
locale-akonadi-lv \
locale-akonadi-mai \
locale-akonadi-mr \
locale-akonadi-nb \
locale-akonadi-nds \
locale-akonadi-nl \
locale-akonadi-nn \
locale-akonadi-pa \
locale-akonadi-pl \
locale-akonadi-pt \
locale-akonadi-pt-BR \
locale-akonadi-ro \
locale-akonadi-ru \
locale-akonadi-sk \
locale-akonadi-sl \
locale-akonadi-sq \
locale-akonadi-sr \
locale-akonadi-sr@ijekavian \
locale-akonadi-sr@ijekavianlatin \
locale-akonadi-sr@latin \
locale-akonadi-sv \
locale-akonadi-ta \
locale-akonadi-th \
locale-akonadi-tr \
locale-akonadi-ug \
locale-akonadi-uk \
locale-akonadi-zh-CN \
locale-akonadi-zh-TW"

RDEPENDS:${PN} += "akonadi"

inherit rpm
