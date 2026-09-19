SUMMARY = "Translations for package kaccounts-integration"
DESCRIPTION = "Provides translations for the 'kaccounts-integration' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kaccounts-integration-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "b1ed31d52adadd2fb50c0c8bbe4dc64057e934a50ecc0fe2a04b326361f9582a3d879ff7a88e232ad147f77ede0e7d442d467b654b866b4c461cb1d84dd868fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kaccounts-integration-lang \
kaccounts-integration-lang-all \
locale-kaccounts-integration-ar \
locale-kaccounts-integration-ast \
locale-kaccounts-integration-az \
locale-kaccounts-integration-bg \
locale-kaccounts-integration-bs \
locale-kaccounts-integration-ca \
locale-kaccounts-integration-ca@valencia \
locale-kaccounts-integration-cs \
locale-kaccounts-integration-da \
locale-kaccounts-integration-de \
locale-kaccounts-integration-el \
locale-kaccounts-integration-en-GB \
locale-kaccounts-integration-eo \
locale-kaccounts-integration-es \
locale-kaccounts-integration-et \
locale-kaccounts-integration-eu \
locale-kaccounts-integration-fi \
locale-kaccounts-integration-fr \
locale-kaccounts-integration-ga \
locale-kaccounts-integration-gl \
locale-kaccounts-integration-he \
locale-kaccounts-integration-hi \
locale-kaccounts-integration-hu \
locale-kaccounts-integration-ia \
locale-kaccounts-integration-id \
locale-kaccounts-integration-is \
locale-kaccounts-integration-it \
locale-kaccounts-integration-ja \
locale-kaccounts-integration-ka \
locale-kaccounts-integration-ko \
locale-kaccounts-integration-lt \
locale-kaccounts-integration-lv \
locale-kaccounts-integration-nl \
locale-kaccounts-integration-nn \
locale-kaccounts-integration-pa \
locale-kaccounts-integration-pl \
locale-kaccounts-integration-pt \
locale-kaccounts-integration-pt-BR \
locale-kaccounts-integration-ro \
locale-kaccounts-integration-ru \
locale-kaccounts-integration-sk \
locale-kaccounts-integration-sl \
locale-kaccounts-integration-sr \
locale-kaccounts-integration-sr@ijekavian \
locale-kaccounts-integration-sr@ijekavianlatin \
locale-kaccounts-integration-sr@latin \
locale-kaccounts-integration-sv \
locale-kaccounts-integration-ta \
locale-kaccounts-integration-tr \
locale-kaccounts-integration-ug \
locale-kaccounts-integration-uk \
locale-kaccounts-integration-zh-CN \
locale-kaccounts-integration-zh-TW"

RDEPENDS:${PN} += "kaccounts-integration"

inherit rpm
