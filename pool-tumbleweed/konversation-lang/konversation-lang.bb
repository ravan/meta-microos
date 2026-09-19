SUMMARY = "Translations for package konversation"
DESCRIPTION = "Provides translations for the 'konversation' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "konversation-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "e7de2cabb99c71e1f37c6c97f9eb531610268367134989df2aedc9b857331a1cf90b9dc6d5dae94bd154a3c4457ee5af14612ba1fa8806df53349b37c83f9e81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konversation-lang \
konversation-lang-all \
locale-konversation-ar \
locale-konversation-ast \
locale-konversation-bg \
locale-konversation-br \
locale-konversation-bs \
locale-konversation-ca \
locale-konversation-ca@valencia \
locale-konversation-cs \
locale-konversation-cy \
locale-konversation-da \
locale-konversation-de \
locale-konversation-el \
locale-konversation-en-GB \
locale-konversation-eo \
locale-konversation-es \
locale-konversation-et \
locale-konversation-eu \
locale-konversation-fi \
locale-konversation-fr \
locale-konversation-ga \
locale-konversation-gl \
locale-konversation-he \
locale-konversation-hi \
locale-konversation-hr \
locale-konversation-hu \
locale-konversation-ia \
locale-konversation-is \
locale-konversation-it \
locale-konversation-ja \
locale-konversation-ka \
locale-konversation-kk \
locale-konversation-km \
locale-konversation-ko \
locale-konversation-lt \
locale-konversation-lv \
locale-konversation-mr \
locale-konversation-ms \
locale-konversation-nb \
locale-konversation-nds \
locale-konversation-nl \
locale-konversation-nn \
locale-konversation-pa \
locale-konversation-pl \
locale-konversation-pt \
locale-konversation-pt-BR \
locale-konversation-ro \
locale-konversation-ru \
locale-konversation-si \
locale-konversation-sk \
locale-konversation-sl \
locale-konversation-sq \
locale-konversation-sr \
locale-konversation-sr@ijekavian \
locale-konversation-sr@ijekavianlatin \
locale-konversation-sr@latin \
locale-konversation-sv \
locale-konversation-ta \
locale-konversation-tr \
locale-konversation-ug \
locale-konversation-uk \
locale-konversation-zh-CN \
locale-konversation-zh-TW"

RDEPENDS:${PN} += "konversation"

inherit rpm
