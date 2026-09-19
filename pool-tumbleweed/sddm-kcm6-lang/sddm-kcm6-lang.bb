SUMMARY = "Translations for package sddm-kcm6"
DESCRIPTION = "Provides translations for the 'sddm-kcm6' package."
LICENSE = "GPL-2.0-only"

PV = "6.7.5"

RPM_NAME = "sddm-kcm6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "66c9ab649ae3afa92fe65db579698b48f59d1a41c5a43b4953283014d7a76db16cd8a220d25e79ca41ae314171ca900269b8abd2d2526b59b3fc0339372c483c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-sddm-kcm6-ar \
locale-sddm-kcm6-ast \
locale-sddm-kcm6-az \
locale-sddm-kcm6-bg \
locale-sddm-kcm6-bs \
locale-sddm-kcm6-ca \
locale-sddm-kcm6-ca@valencia \
locale-sddm-kcm6-cs \
locale-sddm-kcm6-da \
locale-sddm-kcm6-de \
locale-sddm-kcm6-el \
locale-sddm-kcm6-en-GB \
locale-sddm-kcm6-eo \
locale-sddm-kcm6-es \
locale-sddm-kcm6-et \
locale-sddm-kcm6-eu \
locale-sddm-kcm6-fi \
locale-sddm-kcm6-fr \
locale-sddm-kcm6-ga \
locale-sddm-kcm6-gl \
locale-sddm-kcm6-he \
locale-sddm-kcm6-hi \
locale-sddm-kcm6-hu \
locale-sddm-kcm6-ia \
locale-sddm-kcm6-id \
locale-sddm-kcm6-is \
locale-sddm-kcm6-it \
locale-sddm-kcm6-ja \
locale-sddm-kcm6-ka \
locale-sddm-kcm6-ko \
locale-sddm-kcm6-lt \
locale-sddm-kcm6-lv \
locale-sddm-kcm6-ml \
locale-sddm-kcm6-nb \
locale-sddm-kcm6-nl \
locale-sddm-kcm6-nn \
locale-sddm-kcm6-pa \
locale-sddm-kcm6-pl \
locale-sddm-kcm6-pt \
locale-sddm-kcm6-pt-BR \
locale-sddm-kcm6-ro \
locale-sddm-kcm6-ru \
locale-sddm-kcm6-sk \
locale-sddm-kcm6-sl \
locale-sddm-kcm6-sr \
locale-sddm-kcm6-sr@ijekavian \
locale-sddm-kcm6-sr@ijekavianlatin \
locale-sddm-kcm6-sr@latin \
locale-sddm-kcm6-sv \
locale-sddm-kcm6-ta \
locale-sddm-kcm6-tr \
locale-sddm-kcm6-uk \
locale-sddm-kcm6-zh-CN \
locale-sddm-kcm6-zh-TW \
sddm-kcm6-lang \
sddm-kcm6-lang-all"

RDEPENDS:${PN} += "sddm-kcm6"

inherit rpm
