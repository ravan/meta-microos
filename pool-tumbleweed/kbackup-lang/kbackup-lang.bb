SUMMARY = "Translations for package kbackup"
DESCRIPTION = "Provides translations for the 'kbackup' package."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kbackup-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "842d1e8c5fd062b561356b2f1f2251f2cd3d9ee16c02d553a0191d25195b05d94848c04a5d0261fb0b19afde0ecb313e4981430288f21972f7b33f67e697b2c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbackup-lang \
kbackup-lang-all \
locale-kbackup-ar \
locale-kbackup-ast \
locale-kbackup-bg \
locale-kbackup-ca \
locale-kbackup-ca@valencia \
locale-kbackup-cs \
locale-kbackup-da \
locale-kbackup-de \
locale-kbackup-el \
locale-kbackup-en-GB \
locale-kbackup-eo \
locale-kbackup-es \
locale-kbackup-et \
locale-kbackup-eu \
locale-kbackup-fi \
locale-kbackup-fr \
locale-kbackup-ga \
locale-kbackup-gl \
locale-kbackup-he \
locale-kbackup-hi \
locale-kbackup-ia \
locale-kbackup-is \
locale-kbackup-it \
locale-kbackup-ja \
locale-kbackup-ka \
locale-kbackup-ko \
locale-kbackup-lt \
locale-kbackup-lv \
locale-kbackup-nl \
locale-kbackup-nn \
locale-kbackup-pl \
locale-kbackup-pt \
locale-kbackup-pt-BR \
locale-kbackup-ro \
locale-kbackup-ru \
locale-kbackup-sk \
locale-kbackup-sl \
locale-kbackup-sv \
locale-kbackup-tr \
locale-kbackup-ug \
locale-kbackup-uk \
locale-kbackup-zh-CN \
locale-kbackup-zh-TW"

RDEPENDS:${PN} += "kbackup"

inherit rpm
