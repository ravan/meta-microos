SUMMARY = "Translations for package kf6-kirigami"
DESCRIPTION = "Provides translations for the 'kf6-kirigami' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kirigami-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "10b6ccf5b15aa5d08372f81b5b4acce831429caf9083aa5b72a1e1674e655b960becba7f856e9648d03ae481799fe9c8bcb11282fa1db9735c9af6462299acd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-kirigami-lang \
kf6-kirigami-lang-all \
locale-kf6-kirigami-ar \
locale-kf6-kirigami-ast \
locale-kf6-kirigami-az \
locale-kf6-kirigami-bg \
locale-kf6-kirigami-ca \
locale-kf6-kirigami-ca@valencia \
locale-kf6-kirigami-cs \
locale-kf6-kirigami-da \
locale-kf6-kirigami-de \
locale-kf6-kirigami-el \
locale-kf6-kirigami-en-GB \
locale-kf6-kirigami-eo \
locale-kf6-kirigami-es \
locale-kf6-kirigami-et \
locale-kf6-kirigami-eu \
locale-kf6-kirigami-fi \
locale-kf6-kirigami-fr \
locale-kf6-kirigami-ga \
locale-kf6-kirigami-gl \
locale-kf6-kirigami-he \
locale-kf6-kirigami-hi \
locale-kf6-kirigami-hu \
locale-kf6-kirigami-ia \
locale-kf6-kirigami-id \
locale-kf6-kirigami-is \
locale-kf6-kirigami-it \
locale-kf6-kirigami-ja \
locale-kf6-kirigami-ka \
locale-kf6-kirigami-ko \
locale-kf6-kirigami-lt \
locale-kf6-kirigami-lv \
locale-kf6-kirigami-ml \
locale-kf6-kirigami-nb \
locale-kf6-kirigami-nl \
locale-kf6-kirigami-nn \
locale-kf6-kirigami-pa \
locale-kf6-kirigami-pl \
locale-kf6-kirigami-pt \
locale-kf6-kirigami-pt-BR \
locale-kf6-kirigami-ro \
locale-kf6-kirigami-ru \
locale-kf6-kirigami-sk \
locale-kf6-kirigami-sl \
locale-kf6-kirigami-sr \
locale-kf6-kirigami-sr@ijekavian \
locale-kf6-kirigami-sr@ijekavianlatin \
locale-kf6-kirigami-sr@latin \
locale-kf6-kirigami-sv \
locale-kf6-kirigami-ta \
locale-kf6-kirigami-tr \
locale-kf6-kirigami-ug \
locale-kf6-kirigami-uk \
locale-kf6-kirigami-zh-CN \
locale-kf6-kirigami-zh-TW"

RDEPENDS:${PN} += "kf6-kirigami"

inherit rpm
