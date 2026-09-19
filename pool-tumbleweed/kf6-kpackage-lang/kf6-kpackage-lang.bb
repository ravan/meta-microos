SUMMARY = "Translations for package kf6-kpackage"
DESCRIPTION = "Provides translations for the 'kf6-kpackage' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kpackage-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "f0bf0917648f99bc50a6c2a5dfe7059254eb86ea6aa4a9290cc6391f85ddf88f62beb5fa60d77f826f780529e3ba6d0cd986add549e99bf5a68c3dc18e661ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kpackage-lang \
kf6-kpackage-lang-all \
locale-kf6-kpackage-ar \
locale-kf6-kpackage-ast \
locale-kf6-kpackage-az \
locale-kf6-kpackage-bg \
locale-kf6-kpackage-bs \
locale-kf6-kpackage-ca \
locale-kf6-kpackage-ca@valencia \
locale-kf6-kpackage-cs \
locale-kf6-kpackage-da \
locale-kf6-kpackage-de \
locale-kf6-kpackage-el \
locale-kf6-kpackage-en-GB \
locale-kf6-kpackage-eo \
locale-kf6-kpackage-es \
locale-kf6-kpackage-et \
locale-kf6-kpackage-eu \
locale-kf6-kpackage-fi \
locale-kf6-kpackage-fr \
locale-kf6-kpackage-ga \
locale-kf6-kpackage-gd \
locale-kf6-kpackage-gl \
locale-kf6-kpackage-he \
locale-kf6-kpackage-hi \
locale-kf6-kpackage-hr \
locale-kf6-kpackage-hu \
locale-kf6-kpackage-ia \
locale-kf6-kpackage-id \
locale-kf6-kpackage-it \
locale-kf6-kpackage-ja \
locale-kf6-kpackage-ka \
locale-kf6-kpackage-ko \
locale-kf6-kpackage-lt \
locale-kf6-kpackage-lv \
locale-kf6-kpackage-ml \
locale-kf6-kpackage-mr \
locale-kf6-kpackage-nb \
locale-kf6-kpackage-nds \
locale-kf6-kpackage-nl \
locale-kf6-kpackage-nn \
locale-kf6-kpackage-pa \
locale-kf6-kpackage-pl \
locale-kf6-kpackage-pt \
locale-kf6-kpackage-pt-BR \
locale-kf6-kpackage-ro \
locale-kf6-kpackage-ru \
locale-kf6-kpackage-sk \
locale-kf6-kpackage-sl \
locale-kf6-kpackage-sr \
locale-kf6-kpackage-sr@ijekavian \
locale-kf6-kpackage-sr@ijekavianlatin \
locale-kf6-kpackage-sr@latin \
locale-kf6-kpackage-sv \
locale-kf6-kpackage-ta \
locale-kf6-kpackage-tr \
locale-kf6-kpackage-ug \
locale-kf6-kpackage-uk \
locale-kf6-kpackage-zh-CN \
locale-kf6-kpackage-zh-TW"

RDEPENDS:${PN} += "kf6-kpackage"

inherit rpm
