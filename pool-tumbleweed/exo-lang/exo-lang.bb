SUMMARY = "Translations for package exo"
DESCRIPTION = "Provides translations for the 'exo' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.0"

RPM_NAME = "exo-lang-4.20.0-2.8.noarch.rpm"
RPM_HASH = "3d3d341ded54436acf89df633adf8deefe5be62e1b38a68824d66dfe04e63b95943f3bf9c18918426af0cd794bde733d925b05a0d89d1e61e87bd33d9453193c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exo-lang \
exo-lang-all \
locale-exo-ar \
locale-exo-az \
locale-exo-be \
locale-exo-bg \
locale-exo-bn \
locale-exo-ca \
locale-exo-cs \
locale-exo-cy \
locale-exo-da \
locale-exo-de \
locale-exo-el \
locale-exo-en-AU \
locale-exo-en-GB \
locale-exo-es \
locale-exo-et \
locale-exo-eu \
locale-exo-fi \
locale-exo-fr \
locale-exo-gl \
locale-exo-he \
locale-exo-hr \
locale-exo-hu \
locale-exo-id \
locale-exo-is \
locale-exo-it \
locale-exo-ja \
locale-exo-ka \
locale-exo-kn \
locale-exo-ko \
locale-exo-lt \
locale-exo-lv \
locale-exo-ms \
locale-exo-nb \
locale-exo-nl \
locale-exo-nn \
locale-exo-oc \
locale-exo-pa \
locale-exo-pl \
locale-exo-pt \
locale-exo-pt-BR \
locale-exo-ro \
locale-exo-ru \
locale-exo-si \
locale-exo-sk \
locale-exo-sl \
locale-exo-sq \
locale-exo-sr \
locale-exo-sv \
locale-exo-te \
locale-exo-th \
locale-exo-tr \
locale-exo-ug \
locale-exo-uk \
locale-exo-vi \
locale-exo-zh-CN \
locale-exo-zh-HK \
locale-exo-zh-TW"

RDEPENDS:${PN} += "libexo-2-0"

inherit rpm
