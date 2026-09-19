SUMMARY = "Translations for package kmail-account-wizard"
DESCRIPTION = "Provides translations for the 'kmail-account-wizard' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kmail-account-wizard-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "2dcba59822b40d9385204514ed95a92fc8c9c644129be35f4c2ccc5a3e0a6708b0fe0a45649f1c454be4d4f8994867385dc2bcafa99bbb0a6d49c355473efff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmail-account-wizard-lang \
kmail-account-wizard-lang-all \
locale-kmail-account-wizard-ar \
locale-kmail-account-wizard-ast \
locale-kmail-account-wizard-az \
locale-kmail-account-wizard-bg \
locale-kmail-account-wizard-bs \
locale-kmail-account-wizard-ca \
locale-kmail-account-wizard-ca@valencia \
locale-kmail-account-wizard-cs \
locale-kmail-account-wizard-da \
locale-kmail-account-wizard-de \
locale-kmail-account-wizard-el \
locale-kmail-account-wizard-en-GB \
locale-kmail-account-wizard-eo \
locale-kmail-account-wizard-es \
locale-kmail-account-wizard-et \
locale-kmail-account-wizard-eu \
locale-kmail-account-wizard-fi \
locale-kmail-account-wizard-fr \
locale-kmail-account-wizard-ga \
locale-kmail-account-wizard-gl \
locale-kmail-account-wizard-he \
locale-kmail-account-wizard-hi \
locale-kmail-account-wizard-hu \
locale-kmail-account-wizard-ia \
locale-kmail-account-wizard-it \
locale-kmail-account-wizard-ja \
locale-kmail-account-wizard-ka \
locale-kmail-account-wizard-kk \
locale-kmail-account-wizard-km \
locale-kmail-account-wizard-ko \
locale-kmail-account-wizard-lt \
locale-kmail-account-wizard-lv \
locale-kmail-account-wizard-mai \
locale-kmail-account-wizard-mr \
locale-kmail-account-wizard-nb \
locale-kmail-account-wizard-nds \
locale-kmail-account-wizard-nl \
locale-kmail-account-wizard-nn \
locale-kmail-account-wizard-pa \
locale-kmail-account-wizard-pl \
locale-kmail-account-wizard-pt \
locale-kmail-account-wizard-pt-BR \
locale-kmail-account-wizard-ro \
locale-kmail-account-wizard-ru \
locale-kmail-account-wizard-sk \
locale-kmail-account-wizard-sl \
locale-kmail-account-wizard-sr \
locale-kmail-account-wizard-sr@ijekavian \
locale-kmail-account-wizard-sr@ijekavianlatin \
locale-kmail-account-wizard-sr@latin \
locale-kmail-account-wizard-sv \
locale-kmail-account-wizard-th \
locale-kmail-account-wizard-tr \
locale-kmail-account-wizard-ug \
locale-kmail-account-wizard-uk \
locale-kmail-account-wizard-zh-CN \
locale-kmail-account-wizard-zh-TW"

RDEPENDS:${PN} += "kmail-account-wizard"

inherit rpm
