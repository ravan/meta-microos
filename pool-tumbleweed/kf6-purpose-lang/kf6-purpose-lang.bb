SUMMARY = "Translations for package kf6-purpose"
DESCRIPTION = "Provides translations for the 'kf6-purpose' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-purpose-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "376d2b32be06c3a87228f048d2c19d5a8688b118868f3de94918c0b5d97664fc0512909b889b7924d769967333bb47298ac3e3ac10de69c43687d0f0b25c8581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-purpose-lang \
kf6-purpose-lang-all \
locale-kf6-purpose-ar \
locale-kf6-purpose-ast \
locale-kf6-purpose-az \
locale-kf6-purpose-bg \
locale-kf6-purpose-ca \
locale-kf6-purpose-ca@valencia \
locale-kf6-purpose-cs \
locale-kf6-purpose-da \
locale-kf6-purpose-de \
locale-kf6-purpose-el \
locale-kf6-purpose-en-GB \
locale-kf6-purpose-eo \
locale-kf6-purpose-es \
locale-kf6-purpose-et \
locale-kf6-purpose-eu \
locale-kf6-purpose-fi \
locale-kf6-purpose-fr \
locale-kf6-purpose-ga \
locale-kf6-purpose-gl \
locale-kf6-purpose-he \
locale-kf6-purpose-hi \
locale-kf6-purpose-hu \
locale-kf6-purpose-ia \
locale-kf6-purpose-id \
locale-kf6-purpose-is \
locale-kf6-purpose-it \
locale-kf6-purpose-ja \
locale-kf6-purpose-ka \
locale-kf6-purpose-ko \
locale-kf6-purpose-lt \
locale-kf6-purpose-lv \
locale-kf6-purpose-ml \
locale-kf6-purpose-nb \
locale-kf6-purpose-nl \
locale-kf6-purpose-nn \
locale-kf6-purpose-pa \
locale-kf6-purpose-pl \
locale-kf6-purpose-pt \
locale-kf6-purpose-pt-BR \
locale-kf6-purpose-ro \
locale-kf6-purpose-ru \
locale-kf6-purpose-sk \
locale-kf6-purpose-sl \
locale-kf6-purpose-sq \
locale-kf6-purpose-sv \
locale-kf6-purpose-ta \
locale-kf6-purpose-tr \
locale-kf6-purpose-ug \
locale-kf6-purpose-uk \
locale-kf6-purpose-zh-CN \
locale-kf6-purpose-zh-TW"

RDEPENDS:${PN} += "kf6-purpose"

inherit rpm
