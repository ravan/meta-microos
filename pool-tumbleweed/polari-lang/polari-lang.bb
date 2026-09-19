SUMMARY = "Translations for package polari"
DESCRIPTION = "Provides translations for the 'polari' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "50.0"

RPM_NAME = "polari-lang-50.0-1.2.noarch.rpm"
RPM_HASH = "722ea9c935361d2d840177e9af8fa7d6a7dfaf54eb2ecb0a03d221661c27304ef61959c235b6fac362c700a778a4b32e07abaa0d9d1fa9ed42c091967d08e9b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-polari-af \
locale-polari-ar \
locale-polari-as \
locale-polari-be \
locale-polari-bg \
locale-polari-bs \
locale-polari-ca \
locale-polari-ca@valencia \
locale-polari-cs \
locale-polari-da \
locale-polari-de \
locale-polari-el \
locale-polari-en-GB \
locale-polari-eo \
locale-polari-es \
locale-polari-et \
locale-polari-eu \
locale-polari-fa \
locale-polari-fi \
locale-polari-fr \
locale-polari-fur \
locale-polari-gl \
locale-polari-he \
locale-polari-hi \
locale-polari-hr \
locale-polari-hu \
locale-polari-id \
locale-polari-is \
locale-polari-it \
locale-polari-ja \
locale-polari-ka \
locale-polari-kk \
locale-polari-ko \
locale-polari-lt \
locale-polari-lv \
locale-polari-ml \
locale-polari-ms \
locale-polari-nb \
locale-polari-ne \
locale-polari-nl \
locale-polari-oc \
locale-polari-pa \
locale-polari-pl \
locale-polari-pt \
locale-polari-pt-BR \
locale-polari-ro \
locale-polari-ru \
locale-polari-sk \
locale-polari-sl \
locale-polari-sr \
locale-polari-sr@latin \
locale-polari-sv \
locale-polari-te \
locale-polari-th \
locale-polari-tr \
locale-polari-uk \
locale-polari-vi \
locale-polari-zh-CN \
locale-polari-zh-HK \
locale-polari-zh-TW \
polari-lang \
polari-lang-all"

RDEPENDS:${PN} += "polari"

inherit rpm
