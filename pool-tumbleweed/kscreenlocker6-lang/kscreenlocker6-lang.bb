SUMMARY = "Translations for package kscreenlocker6"
DESCRIPTION = "Provides translations for the 'kscreenlocker6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kscreenlocker6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "181b0d0fd9b8cc4329ee5979f225b5aeda6afdb6224a6109a04a0c9c5dba0b1efa4ff0f3dc812dba20e6846e6b24e088bb0f91282f97f03bed61cd69e87a189e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kscreenlocker6-lang \
kscreenlocker6-lang-all \
locale-kscreenlocker6-ar \
locale-kscreenlocker6-ast \
locale-kscreenlocker6-az \
locale-kscreenlocker6-bg \
locale-kscreenlocker6-bs \
locale-kscreenlocker6-ca \
locale-kscreenlocker6-ca@valencia \
locale-kscreenlocker6-cs \
locale-kscreenlocker6-da \
locale-kscreenlocker6-de \
locale-kscreenlocker6-el \
locale-kscreenlocker6-en-GB \
locale-kscreenlocker6-eo \
locale-kscreenlocker6-es \
locale-kscreenlocker6-et \
locale-kscreenlocker6-eu \
locale-kscreenlocker6-fi \
locale-kscreenlocker6-fr \
locale-kscreenlocker6-ga \
locale-kscreenlocker6-gl \
locale-kscreenlocker6-he \
locale-kscreenlocker6-hi \
locale-kscreenlocker6-hu \
locale-kscreenlocker6-ia \
locale-kscreenlocker6-id \
locale-kscreenlocker6-is \
locale-kscreenlocker6-it \
locale-kscreenlocker6-ja \
locale-kscreenlocker6-ka \
locale-kscreenlocker6-kk \
locale-kscreenlocker6-ko \
locale-kscreenlocker6-lt \
locale-kscreenlocker6-lv \
locale-kscreenlocker6-ml \
locale-kscreenlocker6-mr \
locale-kscreenlocker6-nb \
locale-kscreenlocker6-nds \
locale-kscreenlocker6-nl \
locale-kscreenlocker6-nn \
locale-kscreenlocker6-pa \
locale-kscreenlocker6-pl \
locale-kscreenlocker6-pt \
locale-kscreenlocker6-pt-BR \
locale-kscreenlocker6-ro \
locale-kscreenlocker6-ru \
locale-kscreenlocker6-sk \
locale-kscreenlocker6-sl \
locale-kscreenlocker6-sr \
locale-kscreenlocker6-sr@ijekavian \
locale-kscreenlocker6-sr@ijekavianlatin \
locale-kscreenlocker6-sr@latin \
locale-kscreenlocker6-sv \
locale-kscreenlocker6-ta \
locale-kscreenlocker6-tr \
locale-kscreenlocker6-ug \
locale-kscreenlocker6-uk \
locale-kscreenlocker6-wa \
locale-kscreenlocker6-zh-CN \
locale-kscreenlocker6-zh-TW"

RDEPENDS:${PN} += "kscreenlocker6"

inherit rpm
