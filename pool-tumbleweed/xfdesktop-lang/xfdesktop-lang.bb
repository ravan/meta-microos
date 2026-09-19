SUMMARY = "Translations for package xfdesktop"
DESCRIPTION = "Provides translations for the 'xfdesktop' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "xfdesktop-lang-4.20.2-1.3.noarch.rpm"
RPM_HASH = "63dc922d7418249228132c1a51eaf483b6a5366d7ca0bd9bb1af8b78297ecffb4c374fbe7c2a39ed16f42ea164556a972373d7a5a4b379fc14a4e6fb14aa4581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfdesktop-ar \
locale-xfdesktop-az \
locale-xfdesktop-be \
locale-xfdesktop-bg \
locale-xfdesktop-bn \
locale-xfdesktop-ca \
locale-xfdesktop-cs \
locale-xfdesktop-da \
locale-xfdesktop-de \
locale-xfdesktop-el \
locale-xfdesktop-en-AU \
locale-xfdesktop-en-CA \
locale-xfdesktop-en-GB \
locale-xfdesktop-eo \
locale-xfdesktop-es \
locale-xfdesktop-et \
locale-xfdesktop-eu \
locale-xfdesktop-fi \
locale-xfdesktop-fr \
locale-xfdesktop-gl \
locale-xfdesktop-he \
locale-xfdesktop-hr \
locale-xfdesktop-hu \
locale-xfdesktop-id \
locale-xfdesktop-is \
locale-xfdesktop-it \
locale-xfdesktop-ja \
locale-xfdesktop-ka \
locale-xfdesktop-ko \
locale-xfdesktop-lt \
locale-xfdesktop-lv \
locale-xfdesktop-ms \
locale-xfdesktop-nb \
locale-xfdesktop-ne \
locale-xfdesktop-nl \
locale-xfdesktop-nn \
locale-xfdesktop-oc \
locale-xfdesktop-pa \
locale-xfdesktop-pl \
locale-xfdesktop-pt \
locale-xfdesktop-pt-BR \
locale-xfdesktop-ro \
locale-xfdesktop-ru \
locale-xfdesktop-si \
locale-xfdesktop-sk \
locale-xfdesktop-sl \
locale-xfdesktop-sq \
locale-xfdesktop-sr \
locale-xfdesktop-sv \
locale-xfdesktop-te \
locale-xfdesktop-th \
locale-xfdesktop-tr \
locale-xfdesktop-ug \
locale-xfdesktop-uk \
locale-xfdesktop-vi \
locale-xfdesktop-zh-CN \
locale-xfdesktop-zh-HK \
locale-xfdesktop-zh-TW \
xfdesktop-lang \
xfdesktop-lang-all"

RDEPENDS:${PN} += "xfdesktop"

inherit rpm
