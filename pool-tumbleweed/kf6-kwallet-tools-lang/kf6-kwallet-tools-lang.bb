SUMMARY = "Translations for package kf6-kwallet-tools"
DESCRIPTION = "Provides translations for the 'kf6-kwallet-tools' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kwallet-tools-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "2e62db8ce9dbe2157a5836bcfdb05f69c0e20dbc3e90fbf777152b0ece6f48e5136daa4d51c332d9892c676586a978c4379caed039f16dc3df49114eea7850fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kwallet-tools-lang \
kf6-kwallet-tools-lang-all \
locale-kf6-kwallet-tools-ar \
locale-kf6-kwallet-tools-ast \
locale-kf6-kwallet-tools-az \
locale-kf6-kwallet-tools-bg \
locale-kf6-kwallet-tools-ca \
locale-kf6-kwallet-tools-ca@valencia \
locale-kf6-kwallet-tools-cs \
locale-kf6-kwallet-tools-da \
locale-kf6-kwallet-tools-de \
locale-kf6-kwallet-tools-el \
locale-kf6-kwallet-tools-en-GB \
locale-kf6-kwallet-tools-eo \
locale-kf6-kwallet-tools-es \
locale-kf6-kwallet-tools-et \
locale-kf6-kwallet-tools-eu \
locale-kf6-kwallet-tools-fi \
locale-kf6-kwallet-tools-fr \
locale-kf6-kwallet-tools-ga \
locale-kf6-kwallet-tools-gd \
locale-kf6-kwallet-tools-gl \
locale-kf6-kwallet-tools-he \
locale-kf6-kwallet-tools-hi \
locale-kf6-kwallet-tools-hu \
locale-kf6-kwallet-tools-ia \
locale-kf6-kwallet-tools-id \
locale-kf6-kwallet-tools-is \
locale-kf6-kwallet-tools-it \
locale-kf6-kwallet-tools-ja \
locale-kf6-kwallet-tools-ka \
locale-kf6-kwallet-tools-ko \
locale-kf6-kwallet-tools-lt \
locale-kf6-kwallet-tools-lv \
locale-kf6-kwallet-tools-ml \
locale-kf6-kwallet-tools-nl \
locale-kf6-kwallet-tools-nn \
locale-kf6-kwallet-tools-pa \
locale-kf6-kwallet-tools-pl \
locale-kf6-kwallet-tools-pt \
locale-kf6-kwallet-tools-pt-BR \
locale-kf6-kwallet-tools-ro \
locale-kf6-kwallet-tools-ru \
locale-kf6-kwallet-tools-sk \
locale-kf6-kwallet-tools-sl \
locale-kf6-kwallet-tools-sr \
locale-kf6-kwallet-tools-sr@ijekavian \
locale-kf6-kwallet-tools-sr@ijekavianlatin \
locale-kf6-kwallet-tools-sr@latin \
locale-kf6-kwallet-tools-sv \
locale-kf6-kwallet-tools-tr \
locale-kf6-kwallet-tools-ug \
locale-kf6-kwallet-tools-uk \
locale-kf6-kwallet-tools-vi \
locale-kf6-kwallet-tools-zh-CN \
locale-kf6-kwallet-tools-zh-TW"

RDEPENDS:${PN} += "kf6-kwallet-tools"

inherit rpm
